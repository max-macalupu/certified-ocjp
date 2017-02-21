package org.oca.chapter0.model;
import java.util.HashMap;
import java.util.Map;

public class AlgorithCase {
	
	private int[] array_1;
	private int[] array_2;
	
	
	
	public AlgorithCase(int[] array_1, int[] array_2) {
		super();
		this.array_1 = array_1;
		this.array_2 = array_2;
	}

	private enum AnswerEnumValue{
		YES("SI"),NO("NO");		
		private String value;
		private AnswerEnumValue(String value) {
			this.value = value;
		}
		public String getValue() {
			return value;
		}		
	}
	
	public static void main(String[] args) {
		System.out.println(new AlgorithCase(new int[]{1,2,5,3,7,0,7,3,5,2,1}, 
											new int[]{7,3,1,2,5,0,5,2,1,3,7}
										).getPermutationArrays());
		
		System.out.println(new AlgorithCase(new int[]{1,2,5,3,7,0,7,3,5,2,1}, 
											new int[]{7,3,1,2,5,0,5,2,1,3,7}
										).getPermutationArrays());
		
		System.out.println(new AlgorithCase(new int[]{1,2,3,4,5,6,7,8,9,10,11}, 
											new int[]{6,5,4,3,2,0,11,10,9,8,7}
										).getPermutationArrays());
	}
	
	public String getPermutationArrays(){		
		int[] array_1 = this.array_1;
		int[] array_2 = this.array_2;
		
		if(array_1.length != array_2.length){
			return AnswerEnumValue.NO.getValue();
		}
		
		Map<Integer, Integer> arrayMap_1 = getArrayMap(array_1);
		Map<Integer, Integer> arrayMap_2 = getArrayMap(array_2);		
		
		if(arrayMap_1.size() != arrayMap_2.size()){
			return AnswerEnumValue.NO.getValue();
		}
		
		for(int key: arrayMap_1.keySet()){
			if(!keyAndValueExistInMap(key, arrayMap_1.get(key), arrayMap_2)){
				return AnswerEnumValue.NO.getValue();
			}
		}
		
		for(int key: arrayMap_2.keySet()){
			if(!keyAndValueExistInMap(key, arrayMap_2.get(key), arrayMap_1)){
				return AnswerEnumValue.NO.getValue();
			}
		}
				
		return AnswerEnumValue.YES.getValue();
	}
	
	public boolean keyAndValueExistInMap(int key, int value, Map<Integer,Integer> map){
		return map.get(key) != null ? map.get(key) == value : false;
	}
	
	public Map<Integer, Integer> getArrayMap(int[] arrayData){
		Map<Integer, Integer> arrayMap = new HashMap<>();
		for(int data: arrayData){
			if(arrayMap.get(data)==null){
				arrayMap.put(data,1);
			}
			arrayMap.put(data,arrayMap.get(data)+1);			
		}
		return arrayMap;
	}

}

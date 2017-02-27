package org.oca.chapter03.nested;

public abstract class Shape {

	public static class Color{
		private int m_red, m_yellow, m_blue;
		public Color(){
			this(0, 0, 0);
		}
		
		public Color(int m_red, int m_yello, int m_blue){
			this.m_red = m_red; this.m_yellow = m_yello; this.m_blue = m_blue;
		}

		@Override
		public String toString() {
			return "Color [m_red=" + m_red + ", m_yellow=" + m_yellow + ", m_blue=" + m_blue + "]";
		}		
	}	
}

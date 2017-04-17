package org.oca.mocks.whizlabs.test_III;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_29 {
    public static void main(String[] args) {
        processTHisAwesomeMethod();
    }

    private static void processTHisAwesomeMethod(){
        Path path = Paths.get("D://data//personal//projects//docker//images//hadoop//2.7//version-1//hadoop-docker//hdfs-site.xml");
        Path path1 = Paths.get("D://data//personal//..//..//test//hdfs-site.xml");
        System.out.println(path1.normalize());
//        Path path2 = Paths.get("D://").relativize(path1.normalize());
        Path path2 = path1.relativize(path1.normalize());
        System.out.println(path2);
        System.out.println(path.getNameCount() + "  " + path2.getNameCount());
    }
}

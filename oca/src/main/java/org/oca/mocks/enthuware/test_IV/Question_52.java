package org.oca.mocks.enthuware.test_IV;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_52 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("d:\\data\\aaa.txt");
        PosixFileAttributes attributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class).readAttributes();
        System.out.println(attributeView.owner().getName());

        AclFileAttributeView aclAttributeView = Files.getFileAttributeView(path, AclFileAttributeView.class);
        UserPrincipal aclFileAttributes = aclAttributeView.getOwner();
        System.out.println(aclFileAttributes.getName());
    }
}

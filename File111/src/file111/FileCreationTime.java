
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file111;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author MULTINORM-USR-78
 */
class FileCreationTime {
     public static FileTime getCreationTime(File file) throws IOException {
    Path p = Paths.get(file.getAbsolutePath());
    BasicFileAttributes view
        = Files.getFileAttributeView(p, BasicFileAttributeView.class)
                    .readAttributes();
    FileTime fileTime=view.creationTime();
    //  also available view.lastAccessTine and view.lastModifiedTime
    return fileTime;
    
    }
}

package com.db.design.combination;

import java.util.ArrayList;
import java.util.List;

public class TestDemo1 {


    public static void main(String[] args) {
        Folder folder1,folder2,folder3;

        folder1 = new Folder("qyy的资料");
        folder2 = new Folder("图像资料");
        folder3 = new Folder("文本资料");

        ImageFile image1,image2;
        image1 = new ImageFile("小龙女.jpg");
        image2 = new ImageFile("杨过.png");

        TextFile textFile1,textFile2;
        textFile1 = new TextFile("九阴真经");
        textFile2 = new TextFile("九阳神功");

        folder2.addImageFile(image1);
        folder2.addImageFile(image2);
        folder3.addTextFile(textFile1);
        folder3.addTextFile(textFile2);
        folder1.addFolder(folder2);
        folder1.addFolder(folder3);

        folder1.killVirus();
    }
}

class ImageFile{
    private String name;

    public ImageFile(String name){
        this.name = name;
    }

    public void killVirus(){
        //简化代码
        System.out.println("----对图像文件，" + name + "进行杀毒");
    }
}

class TextFile{

    private String name;

    public TextFile(String name){
        this.name = name;
    }

    public void killVirus(){
        //简化代码
        System.out.println("----对文本文件，"+name+"进行杀毒");
    }

}

class Folder{
    private String name;

    private List<Folder> folders = new ArrayList<Folder>();

    private List<TextFile> textFiles = new ArrayList<TextFile>();

    private List<ImageFile> imageFiles = new ArrayList<ImageFile>();

    public Folder(String name){
        this.name = name;
    }

    public void addFolder(Folder folder){
        folders.add(folder);
    }

    public void addTextFile(TextFile file){
        textFiles.add(file);
    }

    public void addImageFile(ImageFile imageFile){
        imageFiles.add(imageFile);
    }

    public void killVirus(){
        System.out.println("****对文件夹" + name + "进行杀毒");
        for(Object obj : folders){
            ((Folder)obj).killVirus();
        }

        for (Object obj : textFiles) {
            ((TextFile)obj).killVirus();
        }

        for (Object obj : imageFiles) {
            ((ImageFile)obj).killVirus();
        }
    }


}



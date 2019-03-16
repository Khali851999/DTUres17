package com.example.sachin.dtures;

public class abcd {
    private String subjectDisp,SubjectDisc;
    private int imgRes;

    public abcd(String subject, String info, int imageResource)
    {
        imgRes=imageResource;
        subjectDisp=subject;
        SubjectDisc=info;
    }

    public int getImgRes()  {return imgRes;}
    public String getKann() {
        return subjectDisp;
    }
    public String getEngg() {
        return SubjectDisc;
    }
}

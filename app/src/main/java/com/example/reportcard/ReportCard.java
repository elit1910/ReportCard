package com.example.reportcard;

/**
 * Created by estlander on 22/02/2017.
 */

public class ReportCard {

    private int StunderandeNummer;
    private String Namn, Kurs;
    private int Vitsord;
    private int Period;

    public ReportCard(String Namn,int StuderandeNummer, int Period, String Kurs, int Vitsord){
        this.Namn = Namn;
        this.StunderandeNummer = StuderandeNummer;
        this.Period = Period;
        this.Kurs = Kurs;
        this.Vitsord = Vitsord;
    }

    //Get the specific Values
    public int getStuderandeNummer(){
        return StunderandeNummer;
    }
    public String getNamn(){
        return Namn;
    }
    public int getPeriod(){
        return Period;
    }
    public String getKurs(){
        return Kurs;
    }
    public int getVitsord(){
        return Vitsord;
    }
    //set specific values
    public void setStuderandeNummer(int Id){
        this.StunderandeNummer = Id;
    };
    public void setNamn(String nimi){
        this.Namn=nimi;
    }
    public void setPeriod(int jakso){
        this.Period = jakso;
    }
    public void setKurs(String kurssi){
        this.Kurs = kurssi;
    }
    public void setVitsord(int arvosana){
        this.Vitsord = arvosana;
    }

    public int getGrade( int tentResultat){

        int grade;

        if (tentResultat>90){
             grade = 5;
        }else if (90>tentResultat && tentResultat>79){
             grade =4;
        }else if (80>tentResultat && tentResultat>69){
             grade =3;
        }else if (70>tentResultat && tentResultat>59){
             grade =2;
        }else if (60>tentResultat && tentResultat>49){
             grade =1;
        }else {
             grade =0;
        }
        return grade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "studentID=" + StunderandeNummer +
                ", studentName='" + Namn + '\'' +
                ", course='" + Kurs + '\'' +
                ", grade=" + Vitsord +
                ", semester='" + Period + '\'' +
                '}';
    }
}



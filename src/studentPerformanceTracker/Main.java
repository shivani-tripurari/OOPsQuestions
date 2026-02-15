package studentPerformanceTracker;
import java.util.*;


class Student{
    //the two properties of every student
    private String stuName;
    private ArrayList<Integer>marks;

    //methods
    public void addMarks(int m){
        if(m>=0 && m<=100){
            marks.add(m);
        }
        else{
            throw new RuntimeException("Added marks are not in valid range");
        }
    }
    public int getAvg(){
        if(marks.size()==0){
            return 0;
        }
        int sum = 0;
        int avg = 0;
        for(int mark : marks){
            sum += mark;
        }
        avg = sum/marks.size();
        return avg;
    }
    public int getTotalNumber(){
        return marks.size();
    }
    public int getHighestMarks(){
        if(marks.size()==0){
            throw new RuntimeException("No marks present");
        }
        int highestMark = marks.get(0);
        for(int mark : marks){
            if(highestMark<mark){
                highestMark = mark;
            }
        }
        return highestMark;
    }
    public int getLeastMarks(){
        if(marks.size()==0){
            throw new RuntimeException("No marks present");
        }
        int leastMark = marks.get(0);
        for(int mark : marks){
            if(leastMark>mark){
                leastMark = mark;
            }
        }
        return leastMark;
    }

    //parameterized constructor
    public Student(String name){
        this.stuName = name;
        this.marks = new ArrayList<>();
    }
}

public class Main {
    public static void main(String args[]){
        //creating a new object
        Student stu1 = new Student("Vishnu");
        stu1.addMarks(97);
        stu1.addMarks(90);
        stu1.addMarks(93);
        System.out.println(stu1.getTotalNumber());
        System.out.println(stu1.getAvg());
        System.out.println(stu1.getHighestMarks());
        System.out.println(stu1.getLeastMarks());
    }
}

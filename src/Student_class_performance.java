import java.util.*;
public class Student_class_performance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int students[][]=new int[15][5];
        int studentmarks[]=new int[15];
        int[] Rank=new int[5];
        int TotalAvgMarks=0;

        int[] subjectAvg=new int[5];
        
        // Totalmarks

        for(int i=0;i<15;i++){
            int sum=0;
            for(int j=0;j<5;j++){
                students[i][j]=sc.nextInt();
                sum+=students[i][j];
            }
            studentmarks[i]=sum;
        }
        for(int i=0;i<15;i++){
            System.out.println("Total marks Scored by student " +(i+1)+ " , is :"+studentmarks[i]);
        }

        // Rank of student

        for(int i=0;i<15;i++){
            int c=0;
            for(int j=0;j<5;j++){
                if(studentmarks[j]>studentmarks[i]){
                    c++;
                }
            }
            Rank[i]=c+1;
        }
        for(int i=0;i<15;i++){
            System.out.println("Rank secured by the student " +(i+1)+" , is :"+Rank[i]);
        }

        //Top 3

        for(int i=0;i<15;i++){
            if(Rank[i]==1){
                System.out.println("Top_1 Student is :  "+(i+1));
            }
            if(Rank[i]==2){
                System.out.println("Top_2 Student is :  "+(i+1));
            }
            if(Rank[i]==3){
                System.out.println("Top_3 Student is :   "+(i+1));
            }
        }

        //Average

        for(int i=0;i<15;i++){
            TotalAvgMarks+=studentmarks[i];
        }
        System.out.println("Average total Marks of the whole class is : " + TotalAvgMarks/3);

        //Avg of each subject

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++) {
                subjectAvg[j] += students[i][j];
            }
        }
        for(int i=0;i<5;i++){
            System.out.println("Average of each subject "+(i+1)+ " is :"+subjectAvg[i]/2);
        }

        //performance

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(students[i][j]<50){
                    System.out.println("student who performed poor is"+(i+1) +" , rank is : "+Rank[i] +" in the subject "+(j+1)+
                            " with total marks of " +studentmarks[i]);
                }
            }
        }
    }
}


package arrayConcept;

public class MaxNoFromArray {
    //3  4  9
    //6  5  7
    //2 8  1
    public static void main(String[] args) {
        int abc[][]= { {3, 4,9},{6,5,7},{2,8,1}};
        int min=abc[0][0];
        for( int i=0; i<3; i++)
        {
            for(int j=3; j<3; j++)
            {
                if (abc[i][j]<min)
                {
                    min=abc[3][3];
                }
                System.out.println(min);
            }

        }

    }


}

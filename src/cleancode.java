public class cleancode {
    static class check {

        int firstNumber;
        int secondNumber;
    }

    //Method to find Largest number from the given arr
    static check Largestnumber(int[] GivenArray, int ArraySize){

        check objectcheck = new check();

        int i;

        if(ArraySize == 1){
            objectcheck.secondNumber = GivenArray[0];
            objectcheck.firstNumber = GivenArray[0];
            return objectcheck;
        }
        if(GivenArray[0] > GivenArray[1]){
            objectcheck.secondNumber = GivenArray[0];
            objectcheck.firstNumber = GivenArray[1];
        }
        else {
            objectcheck.secondNumber = GivenArray[1];
            objectcheck.firstNumber = GivenArray[0];
        }

        for (i=2; i < ArraySize; i++){
            if(GivenArray[i] > objectcheck.secondNumber)
            {
                objectcheck.secondNumber = GivenArray[i];
            }
            else if (GivenArray[i] < objectcheck.firstNumber)
            {
                objectcheck.firstNumber = GivenArray[i];
            }
        }
        return objectcheck;
    }

    public static void main(String[] args){

        //Given arr
            int [] GivenArray = {1000, 11, 445, 1, 330, 3000};
            int sizeofArray = 6;
            check objectcheck = Largestnumber(GivenArray, sizeofArray);

            //Printing Array Elements
            System.out.println("\n Given Array :");
            for (int i=0; i<sizeofArray; i++){
                System.out.println(GivenArray[i]+"");
            }

            System.out.printf("\na is %d", objectcheck.firstNumber);
            System.out.printf("\nb is %d", objectcheck.secondNumber);
        }
    }
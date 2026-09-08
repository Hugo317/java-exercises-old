package org.academiadecodigo.bootcamp;

public class Player {
    String name;

    int[] numbersMap = new int[2];
    int numberAttempt = 0;
    int numberMaxAttempt = 3;                        // DEFINE MAX ATTEMPS
    private static int myNumber = 0;
    int myID = 0;

    int myGuess = RandomNumber.getNumber();


    public Player(String name) {                           // CONSTRUCTOR

        this.name = name;
        myID = ++myNumber;

    }

    public int getNumber() {                            // GET PLAYER ID
        return this.myID;
    }

    public String getName() {                           // GET PLAYER NAME
        return this.name;
    }

    public int myGuess() {                               // GET  PLAYER GUESS
        return this.myGuess;
    }

    public static int players() {
        int tmp = myNumber;

        return tmp;
    }

    public int getNewGuess() {
        /*
        if (numberAttempt >= numberMaxAttempt) {
            return 0;
        }
        int temp = 0;


        boolean numCatch = true;

        while (numCatch) {
            temp = RandomNumber.getNumber();
            for (int x = 0; x < this.numbersMap.length; x++) {
                if (this.numbersMap[x] == temp) {
                    numCatch = false;
                }
            }
        }    */
                int temp = RandomNumber.getNumber();
                numberAttempt++;
                this.myGuess = temp;
                //this.numbersMap[numberAttempt] = this.myGuess;
                return this.myGuess;
            }

        }




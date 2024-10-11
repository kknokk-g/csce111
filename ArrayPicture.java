
/*
 * Grace Du
 * UIN 332005944
 * CSCE 111 SEC 506
 * ArrayPicture.java
 * 10/13/2023
 * 
 */


import  java.io.*;
  /*
  Writing file example, in a method.
  Creating ppm File output.ppm
  view at http://web.eecs.utk.edu/~smarz1/pgmview/ or
  other PPM viewers
  */
public class ArrayPicture {
    public static void main(String[] args) {
    //set the size of your square 600.
        int mySize = 600;
        //build 3 parallel arrays. You can rename them if you want.
        int[][] red = new int[mySize][mySize];
        int[][] green = new int[mySize][mySize];
        int[][] blue = new int[mySize][mySize];
        //and idea for createing colors  - oranges
        int Or1R = 255;
        int Or1G = 234;
        int OR1B = 228;

        int Or2R = 255;
        int Or2G = 234;
        int OR2B = 221;
        // and here is Purple.
        int PRR = 114;
        int PRG = 96;
        int PRB = 180;
        //yellow
        int YR = 253;
        int YG = 255;
        int YB = 128;
        //blue for candles
        int BR = 178;
        int BG = 252;
        int BB = 250;
        //pink for cake
        int PR = 251;
        int PG = 178;
        int PB = 253;
        //white for plate
        int WR = 254;
        int WG = 253;
        int WB = 245;
    
        // the backgroud layer
        for (int x = 0; x < mySize; x++) {
            for (int y = 0; y < 200; y++) {
                red[x][y] = Or1R;
                green[x][y] = Or1G;
                blue[x][y] = OR1B;
            }
        }
        for (int x = 0; x < mySize; x++) {
            for (int y = 200; y < 400; y++) {
                red[x][y] = Or2R;
                green[x][y] = Or2G;
                blue[x][y] = OR2B;
            }
        }
        for (int x = 0; x < mySize; x++) {
            for (int y = 400; y < 600; y++) {
               red[x][y] = Or1R;
                green[x][y] = Or1G;
                blue[x][y] = OR1B;
            }
        }
        
            
        // the second layer
        //frame for candles
        for (int x = 120; x < 190; x++) {//candle left
            for (int y = 130; y < 180; y++) {
                red[x][y] = PRR;
                green[x][y] = PRG;
                blue[x][y] = PRB;
            }
        }
        
        for (int x = 120; x < 190; x++) {//candle middle
            for (int y = 265 ; y < 315; y++) {
                red[x][y] = PRR;
                green[x][y] = PRG;
                blue[x][y] = PRB;
            }
        }
        for (int x = 120; x < 190; x++) {//candle right
            for (int y = 400; y < 450; y++) {
                red[x][y] = PRR;
                green[x][y] = PRG;
                blue[x][y] = PRB;
            }
        }
        //frame for cake
        for (int x = 190; x < 440; x++) {
            for (int y = 90; y < 490; y++) {
                red[x][y] = PRR;
                green[x][y] = PRG;
                blue[x][y] = PRB;
            }
        }
        //frame for plate
        for (int x = 440; x < 490; x++) {
            for (int y = 50; y < 530; y++) {
                red[x][y] = PRR;
                green[x][y] = PRG;
                blue[x][y] = PRB;
            }
        }

        //third layer--coloring
        //fires
        for (int x = 90; x < 120; x++) {//fire left
            for (int y = 150; y < 160; y++) {
                red[x][y] = YR;
                green[x][y] = YG;
                blue[x][y] = YB;
            }
        }
        
        for (int x = 90; x < 120; x++) {//fire middle
            for (int y = 285 ; y < 295; y++) {
                red[x][y] = YR;
                green[x][y] = YG;
                blue[x][y] = YB;
            }
        }
        for (int x = 90; x < 120; x++) {//fire right
            for (int y = 420; y < 430; y++) {
                red[x][y] = YR;
                green[x][y] = YG;
                blue[x][y] = YB;
            }
        }
        //candles
         for (int x = 130; x < 190; x++) {//candle left
            for (int y = 140; y < 170; y++) {
                red[x][y] = BR;
                green[x][y] = BG;
                blue[x][y] = BB;
            }
        }
        for (int x = 130; x < 190; x++) {//candle middle
            for (int y = 275 ; y < 305; y++) {
                red[x][y] = BR;
                green[x][y] = BG;
                blue[x][y] = BB;
            }
        }
        for (int x = 130; x < 190; x++) {//candle right
            for (int y = 410; y < 440; y++) {
               red[x][y] = BR;
                green[x][y] = BG;
                blue[x][y] = BB;
            }
        }
        //cake
        for (int x = 200; x < 440; x++) {
            for (int y = 100; y < 480; y++) {
                red[x][y] = PR;
                green[x][y] = PG;
                blue[x][y] = PB;
            }
        }
        //decorations on cake
        for (int x = 250; x < 300; x++) {//line upper
            for (int y = 100; y < 480; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        for (int x = 350; x < 400; x++) {//line below
            for (int y = 100; y < 480; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        //plate
        for (int x = 450; x < 480; x++) {
            for (int y = 60; y < 520; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        //sign
        for (int x = 500; x < 550; x++) {//line on the left
            for (int y =540; y < 550; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        for (int x = 520; x < 530; x++) {//square in the middle
            for (int y =550; y < 560; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        for (int x = 510; x < 520; x++) {//upper rectangle
            for (int y =560; y < 565; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
         for (int x = 500; x < 510; x++) {//upper square
            for (int y =565; y < 575; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        for (int x = 530; x < 540; x++) {//lower rectangle
            for (int y =560; y < 565; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        for (int x = 540; x < 550; x++) {//lower square
            for (int y =565; y < 575; y++) {
                red[x][y] = WR;
                green[x][y] = WG;
                blue[x][y] = WB;
            }
        }
        
       
        
         
        // Fill the arrays using loops, equations,
        // user input for color choices (validate data if you do this)
        // or use methods to do this.
        // Hint, fill with one color, then overwrite certian areas with
        // another color.

        // when arrays are filled, send them to writeFile
        writeFile(red, green, blue, "C");

        // convert your image to gray scale (Black and white)

        for (int i = 0; i < red.length; i++) {
            for (int j = 0; j < red[i].length; j++) {
                int grayscaleValue = (int) (0.3 * red[i][j] + 0.59 * green[i][j] + 0.11 * blue[i][j]);//convert all colors into gray
                red[i][j] = grayscaleValue;
                green[i][j] = grayscaleValue;
                blue[i][j] = grayscaleValue;
            }
        }



        // when arrays are filled, send them to writeFile
        writeFile(red, green, blue, "G");
    }//end main


/**
 * Given 3 parallel arrays, Writefile will write an output
 * file in PPM format that can be viewed with a ppm viewer.
 * All 3 arrays must be the same size.
 * @param r 2 dimentional array of integers from 0 - 255
 * @param g 2 dimentional array of integers from 0 - 255
 * @param b 2 dimentional array of integers from 0 - 255
 * you do not need to edit this method
 */
    public static void writeFile(int[][] r, int[][] g, int[][] b, String outputType) {
        //the output will be based on the array size sent.
        int size = r.length;
        //pixel will store the color to be output to the file.
        String pixel;
        try {
            //open a file in the current directory. will overwrite
            //previous versions.
            String fileName = "output"+outputType+".ppm";
            File output = new File(fileName);
            FileWriter fw = new FileWriter(output);
            //create the header of PPM files.
            fw.write("P3\n"+ size + " " + size +"\n255\n");
            //write out all pixels from the RGB arrays.
            for (int i = 0; i < size ; i++) {
                for (int j = 0; j < size ; j++) {
                    pixel = String.format("%d %d %d ",r[i][j], g[i][j], b[i][j]);
                    fw.write(pixel);
                }//end for j
            }//end for i
            fw.close();
        }
        catch(Exception e) {
            System.out.println("Error writing file.");
        }//end try catch

  	} // end writeFile2
  }  // end class

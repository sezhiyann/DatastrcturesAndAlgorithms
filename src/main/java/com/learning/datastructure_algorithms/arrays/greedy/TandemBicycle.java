package com.learning.datastructure_algorithms.arrays.greedy;

import com.learning.Utils;

/**
 * <div class="_2bgxjrUydJ8e-Z8lo1vpgw"><p>
 *   A tandem bicycle is a bicycle that's operated by two people: person A and
 *   person B. Both people pedal the bicycle, but the person that pedals faster
 *   dictates the speed of the bicycle. So if person A pedals at a speed of
 *   <span>5</span>, and person B pedals at a speed of <span>4</span>, the tandem
 *   bicycle moves at a speed of <span>5</span> (i.e.,
 *   <span>tandemSpeed = max(speedA, speedB)</span>).
 * </p>
 * <p>
 *   You're given two lists of positive integers: one that contains the speeds of
 *   riders wearing red shirts and one that contains the speeds of riders wearing
 *   blue shirts. Each rider is represented by a single positive integer, which is
 *   the speed that they pedal a tandem bicycle at. Both lists have the same
 *   length, meaning that there are as many red-shirt riders as there are
 *   blue-shirt riders. Your goal is to pair every rider wearing a red shirt with a
 *   rider wearing a blue shirt to operate a tandem bicycle.
 * </p>
 * <p>
 *   Write a function that returns the maximum possible total speed or the minimum
 *   possible total speed of all of the tandem bicycles being ridden based on an
 *   input parameter, <span>fastest</span>. If <span>fastest = true</span>, your
 *   function should return the maximum possible total speed; otherwise it should
 *   return the minimum total speed.
 * </p>
 * <p>
 *   "Total speed" is defined as the sum of the speeds of all the tandem bicycles
 *   being ridden. For example, if there are 4 riders (2 red-shirt riders and 2
 *   blue-shirt riders) who have speeds of <span>1, 3, 4, 5</span>, and if they're
 *   paired on tandem bicycles as follows: <span>[1, 4], [5, 3]</span>, then the
 *   total speed of these tandem bicycles is <span>4 + 5 = 9</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">redShirtSpeeds</span> = [5, 5, 3, 9, 2]
 * <span class="CodeEditor-promptParameter">blueShirtSpeeds</span> = [3, 6, 7, 2, 1]
 * <span class="CodeEditor-promptParameter">fastest</span> = true
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>32
 * </pre></div>
 */
public class TandemBicycle {


    public static int get(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        //either array cannot be empty
        if (Utils.isEmpty(redShirtSpeeds) || Utils.isEmpty(blueShirtSpeeds)) {
            return 0;
        }
        //arrays have to be of same length
        int redLength = redShirtSpeeds.length;
        int blueLength = blueShirtSpeeds.length;
        if (redLength != blueLength) {
            return 0;
        }

        Utils.sort(redShirtSpeeds, true);
        Utils.sort(blueShirtSpeeds, !fastest);

        int length = redLength > blueLength ? redLength : blueLength;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int red = redShirtSpeeds[i];
            int blue = blueShirtSpeeds[i];
            //max of the speeds will be speed of the bicycle.
            sum += (red >= blue ? red : blue);
        }
        return sum;
    }
}

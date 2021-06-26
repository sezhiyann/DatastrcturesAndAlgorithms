package com.learning.datastructure.arrays;

/**
 <div class="_2QS9lJTbpSlJhNr4V4OlB0 "><div class="_3IH-jmmtv6iIwrm1H2_Niv"><div class="g1BK5C8Z5tKn3fRjna3rk"><span class="NlFCXmjfJVs3AUYBn1UTR">Difficulty: </span><span class="
 _2N4kZVL6w57OPR1L-in0z1
 _1VwA4-y8_aJaFGXfyjOlxe" data-tip="Easy" currentitem="false"></span></div><div class="g1BK5C8Z5tKn3fRjna3rk"><span class="NlFCXmjfJVs3AUYBn1UTR">Category: </span><span class="_2Nzhv9mxNVsKblZdWRzINP" data-tip="Hidden" currentitem="false">Hidden</span></div><div class="g1BK5C8Z5tKn3fRjna3rk"><span class="NlFCXmjfJVs3AUYBn1UTR">Successful Submissions: </span><span class="">11,278+</span></div></div><h2 class="_3Gk5r1gHiCsJ1pzG100gFe">Class Photos<div class="_3hLZxgOCJgUUQUYUDgM9vM undefined" data-tip="Question Not Submitted" currentitem="false"></div><svg viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg" class="VHJQYiu1LAw4h5L1FVO6Q"><path d="M12.821 16a.5.5 0 01-.203-.043L8 13.901l-4.618 2.056a.501.501 0 01-.694-.556L3.707 10.3.147 6.732a.502.502 0 01.255-.845l5.103-1.023L7.543.272c.16-.362.753-.362.914 0l2.037 4.592 5.104 1.023a.5.5 0 01.255.845l-3.56 3.567L13.31 15.4a.5.5 0 01-.49.6zM8 12.852c.069 0 .138.015.203.043l3.938 1.754-.882-4.417a.502.502 0 01.137-.452l3.09-3.094-4.441-.89a.5.5 0 01-.36-.288L8 1.708l-1.686 3.8a.5.5 0 01-.36.288l-4.44.89 3.09 3.094c.117.118.169.288.136.452l-.882 4.417 3.939-1.754A.497.497 0 018 12.852z"></path></svg></h2><div class="_2bgxjrUydJ8e-Z8lo1vpgw"><p>
 It's photo day at the local school, and you're the photographer assigned to
 take class photos. The class that you'll be photographing has an even number
 of students, and all these students are wearing red or blue shirts. In fact,
 exactly half of the class is wearing red shirts, and the other half is wearing
 blue shirts. You're responsible for arranging the students in two rows before
 taking the photo. Each row should contain the same number of the students and
 should adhere to the following guidelines:
 </p>
 <ul>
 <li>All students wearing red shirts must be in the same row.</li>
 <li>All students wearing blue shirts must be in the same row.</li>
 <li>
 Each student in the back row must be strictly taller than the student
 directly in front of them in the front row.
 </li>
 </ul>
 <p>
 You're given two input arrays: one containing the heights of all the students
 with red shirts and another one containing the heights of all the students
 with blue shirts. These arrays will always have the same length, and each
 height will be a positive integer. Write a function that returns whether or
 not a class photo that follows the stated guidelines can be taken.
 </p>
 <p>Note: you can assume that each class has at least 2 students.</p>
 <h3>Sample Input</h3>
 <pre><span class="CodeEditor-promptParameter">redShirtHeights</span> = [5, 8, 1, 3, 4]
 <span class="CodeEditor-promptParameter">blueShirtHeights</span> = [6, 9, 2, 4, 5]
 </pre>
 <h3>Sample Output</h3>
 <pre>true <span class="CodeEditor-promptComment">// Place all students with blue shirts in the back row.</span>
 </pre></div><div class="_2mQbvTwshSbXKaKTFYoEGX"><h3 class="_3Evs6nY-NNfhqlPhJm7h8E">Hints</h3><div class="_3Z0afRrJIQdVuucEaxjYTp"><div class="
 _23fhZgn_BLziwwr1RKZyFO
 _2m0mxdnuxWky0mwypgLI6Y
 NCcAF8rDrd1iLD1p6aj8Y

 " tabindex="0"><div class="
 _1pr5M3ZaZAr7M66SmTRNZI
 undefined
 _4mM3UrFbsyhydzLcGQqxT
 "><div class="_3ep-cHIG9fClzyiGZAyWzO">Hint 1</div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 292.362 292.362" class="_2Opys4DfP_ytDI-6qOoYhl "><path d="M286.935 69.377c-3.614-3.617-7.898-5.424-12.848-5.424H18.274c-4.952 0-9.233 1.807-12.85 5.424C1.807 72.998 0 77.279 0 82.228c0 4.948 1.807 9.229 5.424 12.847l127.907 127.907c3.621 3.617 7.902 5.428 12.85 5.428s9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847 0-4.948-1.814-9.229-5.427-12.85z"></path></svg></div><div class="_3cPSlpWvTZHNHVzFGpWCrS " style="transition: height 400ms linear 0s; height: 0px;"><div class="_2H_2iwk-oa_vcNZxcoehl3"><div class="_20w1gk-UpAMKUJsa_0qbty"><p>
 Start by determining which row will have the students wearing blue shirts and
 which row will have the students wearing red shirts. Once you know this, how
 can you determine if it's possible to take the photo?
 </p>
 </div></div></div></div></div><div class="_3Z0afRrJIQdVuucEaxjYTp"><div class="
 _23fhZgn_BLziwwr1RKZyFO
 _2m0mxdnuxWky0mwypgLI6Y
 NCcAF8rDrd1iLD1p6aj8Y

 " tabindex="0"><div class="
 _1pr5M3ZaZAr7M66SmTRNZI
 undefined
 _4mM3UrFbsyhydzLcGQqxT
 "><div class="_3ep-cHIG9fClzyiGZAyWzO">Hint 2</div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 292.362 292.362" class="_2Opys4DfP_ytDI-6qOoYhl "><path d="M286.935 69.377c-3.614-3.617-7.898-5.424-12.848-5.424H18.274c-4.952 0-9.233 1.807-12.85 5.424C1.807 72.998 0 77.279 0 82.228c0 4.948 1.807 9.229 5.424 12.847l127.907 127.907c3.621 3.617 7.902 5.428 12.85 5.428s9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847 0-4.948-1.814-9.229-5.427-12.85z"></path></svg></div><div class="_3cPSlpWvTZHNHVzFGpWCrS " style="transition: height 400ms linear 0s; height: 0px;"><div class="_2H_2iwk-oa_vcNZxcoehl3"><div class="_20w1gk-UpAMKUJsa_0qbty">
 <p>
 The shirt color of the tallest student will determine which students need to
 be placed in the back row. The tallest student can't be placed in the front
 row because there's no student taller than them who can be placed behind them.
 </p>
 </div></div></div></div></div><div class="_3Z0afRrJIQdVuucEaxjYTp"><div class="
 _23fhZgn_BLziwwr1RKZyFO
 _2m0mxdnuxWky0mwypgLI6Y
 NCcAF8rDrd1iLD1p6aj8Y

 " tabindex="0"><div class="
 _1pr5M3ZaZAr7M66SmTRNZI
 undefined
 _4mM3UrFbsyhydzLcGQqxT
 "><div class="_3ep-cHIG9fClzyiGZAyWzO">Hint 3</div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 292.362 292.362" class="_2Opys4DfP_ytDI-6qOoYhl "><path d="M286.935 69.377c-3.614-3.617-7.898-5.424-12.848-5.424H18.274c-4.952 0-9.233 1.807-12.85 5.424C1.807 72.998 0 77.279 0 82.228c0 4.948 1.807 9.229 5.424 12.847l127.907 127.907c3.621 3.617 7.902 5.428 12.85 5.428s9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847 0-4.948-1.814-9.229-5.427-12.85z"></path></svg></div><div class="_3cPSlpWvTZHNHVzFGpWCrS " style="transition: height 400ms linear 0s; height: 0px;"><div class="_2H_2iwk-oa_vcNZxcoehl3"><div class="_20w1gk-UpAMKUJsa_0qbty">
 <p>
 Once you know which students should be placed in each row, you can simply
 check if each student in the back row can be paired with a student in the
 front row who is shorter than them. If you can't find a satisfactory pairing
 for every student in the back row, then you can't take the photo.
 </p>
 </div></div></div></div></div><div class="_3Z0afRrJIQdVuucEaxjYTp"><div class="
 _23fhZgn_BLziwwr1RKZyFO
 _2m0mxdnuxWky0mwypgLI6Y
 NCcAF8rDrd1iLD1p6aj8Y

 " tabindex="0"><div class="
 _1pr5M3ZaZAr7M66SmTRNZI
 undefined
 _4mM3UrFbsyhydzLcGQqxT
 "><div class="_3ep-cHIG9fClzyiGZAyWzO">Hint 4</div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 292.362 292.362" class="_2Opys4DfP_ytDI-6qOoYhl "><path d="M286.935 69.377c-3.614-3.617-7.898-5.424-12.848-5.424H18.274c-4.952 0-9.233 1.807-12.85 5.424C1.807 72.998 0 77.279 0 82.228c0 4.948 1.807 9.229 5.424 12.847l127.907 127.907c3.621 3.617 7.902 5.428 12.85 5.428s9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847 0-4.948-1.814-9.229-5.427-12.85z"></path></svg></div><div class="_3cPSlpWvTZHNHVzFGpWCrS " style="transition: height 400ms linear 0s; height: 0px;"><div class="_2H_2iwk-oa_vcNZxcoehl3"><div class="_20w1gk-UpAMKUJsa_0qbty">
 <p>
 Sort each input array in descending order, then determine which students will
 be in the front and back rows following Hint #2. After this, simply loop
 through your sorted input arrays, and check if the current tallest student in
 the back row is taller than the current tallest student in the front row. If
 you find that the current tallest student (one that has yet to be placed) in
 the back row isn't taller than the current tallest student in the front row,
 then the photo can't be taken.
 </p></div></div></div></div></div><div class="_3Z0afRrJIQdVuucEaxjYTp"><div class="
 _23fhZgn_BLziwwr1RKZyFO
 _2m0mxdnuxWky0mwypgLI6Y
 NCcAF8rDrd1iLD1p6aj8Y

 " tabindex="0"><div class="
 _1pr5M3ZaZAr7M66SmTRNZI
 undefined
 _4mM3UrFbsyhydzLcGQqxT
 "><div class="_3ep-cHIG9fClzyiGZAyWzO">Optimal Space &amp; Time Complexity</div><svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" viewBox="0 0 292.362 292.362" class="_2Opys4DfP_ytDI-6qOoYhl "><path d="M286.935 69.377c-3.614-3.617-7.898-5.424-12.848-5.424H18.274c-4.952 0-9.233 1.807-12.85 5.424C1.807 72.998 0 77.279 0 82.228c0 4.948 1.807 9.229 5.424 12.847l127.907 127.907c3.621 3.617 7.902 5.428 12.85 5.428s9.233-1.811 12.847-5.428L286.935 95.074c3.613-3.617 5.427-7.898 5.427-12.847 0-4.948-1.814-9.229-5.427-12.85z"></path></svg></div><div class="_3cPSlpWvTZHNHVzFGpWCrS " style="transition: height 400ms linear 0s; height: 0px;"><div class="_2H_2iwk-oa_vcNZxcoehl3"><div class="_20w1gk-UpAMKUJsa_0qbty">O(nlog(n)) time | O(1) space - where n is the number of students</div></div></div></div></div></div></div>
 */
public class ClassPhotos {
    public static void main(String[] args) {

    }
}

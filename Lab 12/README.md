ABOUT:

In this lab, I'll be putting 5 babies all to sleep, and each one of them will
wake up at different times.

WHAT I DID: 

I first created two classes, called Baby and Main. In my Baby class, I made
two attributes, time and name. My attributes types were a String and Integer.
String. In my constructor class, I took in only my String attribute while
I randomly generated an Integer for my time attribute. I then overrode the
run() method from my Runnable abstract class. In this method, I printed out
which "baby", represented as a thread, went to sleep and how long the "baby"
planned on sleeping. After that, I put my "baby" to sleep by calling Thread.sleep().
I then wrapped this method into a try-catch block, so I could catch anything
that might block my "baby" from sleeping. I then print out which "baby" is awake 
and feed me. 

In my main class, I created my five "babies". I created these babies by
making five new threads named baby1,baby2,baby3,baby4, and baby5. All of my
threads had a baby object which passed in the names Noah, Olivia, Liam,
Emma, and Amelia. Lastly, I started up all of my threads.


GOAL: 

The goal of this lab was to practice parallel programming. I was able to learn 
how useful parallel programming can be. I was able to understand that some 
programs would require the computer to do multiple things at the same time or 
some programs simply would be quicker with multiple threads. 

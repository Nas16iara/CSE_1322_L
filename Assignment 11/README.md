ABOUT: 

A partial banking application was implemented, in which we used threads 
to allow multiple account holders to process simultaneous withdrawals from a single checking 
account.

EXPLAINING THE CODE:

I created three classes called CreditCard, CardHolder, and Main.

In the CreditCard class, this is where I set the credit card balance. The credit card balance was set to 
5000.00 in our default constructor. I also create a withdrawal method. This was so I could set a new balance
when a customer withdrew from their account. 

In my cardHolder class, this is where I implemented the Runnable abstract class. In this class, I first 
started by creating a CreditCard object as my attribute. 
In my overloaded constructor, I took in a CreditCard object as my parameter and set it equal to my only
attribute, the CreditCard object. I used the overloaded constructor so that I can see what was required 
to call this class.
I also created a makeWithdrawal method. The goal of this method was to first print out the current balance
in the customer's account and then withdraw money from the customer's account, which was set to $500. Lastly,
I printed out the remaining balance after the withdrawal.
I also Overrode the run() method from our abstract class. In the run method, I  took a thread and put it into a for 
loop which ran six times. In the for loop, I first got my balance from my CreditCard class and then called my makeWithdrawal 
method. After calling the makeWithdrawal method, I checked if the balance was in the negative.

In my drive class, which was named main, I created a CreditCard object and a CardHolder object. My CardHolder took in my 
new CreditCard object. Next, I created two threads which both called my CardHolder class then I started my threads. 

GOAL:

The goal of the assignment was to explore threads and synchronization. This assignment allowed me to see how 
threads are implemented in the real world. This was important because with synchronization our code locks out
the second thread until the first thread is done processing. In doing this, two people withdrawing from the same account
at the same time won't be able to overdraft the account.

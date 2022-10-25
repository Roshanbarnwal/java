package com.dsa1;

public class CallBy {
    int data = 50;//this is not static so we can access it only by creating an object of CallBy.
//    data += 10;       you cannot change the value of instance variable unless you use a method.
    void change(int data){          //this is also not static so same as above. refer to Shadowing for more info.
        data += 100;
        System.out.println(data);
    }

    void change1(CallBy op){        //this is also not static so same as above.
        op.data += 100;
        System.out.println(op.data);
    }



    public static void main(String args[]){
        CallBy yes = new CallBy();
        System.out.println("before change " + yes.data);
        int ch = 500;
        yes.change(ch);
        yes.change(yes.data);
        System.out.println("after change, ch is "+ch);
        System.out.println("after change "+yes.data);
        yes.change1(yes);
        System.out.println("after change1 "+yes.data);
        //changing the int into object by autoboxing
        Integer chh = ch;
        yes.change2(chh);
        System.out.println("after object change2 "+chh);

    }

    void change2(Integer opp){
        opp += 100;
        System.out.println(opp + " inside change2");
    }
}

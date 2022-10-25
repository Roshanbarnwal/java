package com.recursion;

public class Recursion {

}
/*
It helps us in  solving bigger/complex problems in a simple way.
you can convert recursion solution into iteration & vice-versa.
Space complexity is not constant because of recursive calls.
It helps us in breaking down bigger into smaller problems.
 */
/*
Break it down into smaller problem.
The base condition is represented by answers we already have.
For fibonacci number: f(0) = 0 & f(1) = 1 are base cases.
        f(n) = f(n-1) + f(n-2) is recursive relation
 */
/*
How to understand & approach a problem:-
1) Identify if you can break down problem into smaller problems
2) Write the recursive relation if needed.
3) Draw the recursive tree
4) About the tree:
    a) See the flow of functions, how they ar getting in stack.
    b) Identify & focus on left tree calls and right tree calls.
    c) Draw the tree and pointers again and again using pen & paper.
    d) Use a debugger to see the flow.
5) See how the values & what types of values(int,string,etc.) are returned at each step. See where the function call will come out of.
    In the end, you will come out of the main function.

VVVVI:- Variables : 1) Arguments :- these also goes into the next recursive function call
                    2) Return Type
                    3) Body of function
 */

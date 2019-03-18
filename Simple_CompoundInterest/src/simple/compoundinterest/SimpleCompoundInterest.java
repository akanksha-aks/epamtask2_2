/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.compoundinterest;

public class SimpleCompoundInterest {


    public int SI(int principle,int rate ,int time)
    { return principle* rate* time/100;
               }
    public double CI(double n,double p,double r)
    {
        return p*Math.pow(1.0+r/100.0,n)-p;
    }
    
}



package fr.umlv.calc;

import java.util.Scanner;

// javac fr/umlv/calc/*.java && java fr/umlv/calc/Main

/**
 * @desc TD7 - Main
 * @author Nicolas SENECAL
 */
public class Main {

  public static void main(String[] args) {
    /*
    1.1.
    Il est déclaré private car on ne souhaite pas que l'utilisateur utilise un opérateur et une valeur en même temps
     */
    
    System.out.println("\nOpOrValue :");

    OpOrValue expression1 = new OpOrValue(
            OpOrValue.OP_SUB,
            new OpOrValue(
                    OpOrValue.OP_ADD,
                    new OpOrValue(2),
                    new OpOrValue(3)
            ),
            new OpOrValue(4));
    System.out.print(expression1 + " = ");
    System.out.println(expression1.eval());
    
    OpOrValue expression2 = OpOrValue.parse(new Scanner("- + 6 5 2"));
    System.out.print(expression2 + " = ");
    System.out.println(expression2.eval());

    /*
    2.
     */
    System.out.println("\nExpr, Value, Add et Sub... :");
    Expr expr1 = new Sub(
            new Add(
                    new Value(6),
                    new Value(3)
            ),
            new Value(2));
    System.out.print(expr1 + " = ");
    System.out.println(expr1.eval());
    
    /*
    2.2. 
    Parse doit être dans l'interface Expr
    */
    Expr expr2 = Expr.parse(new Scanner("- + 6 5 2"));
    System.out.print(expr2 + " = ");
    System.out.println(expr2.eval());

    /*
    2.4.
    Dans ce cas précis, la classe Expr peut être une classe abstraite ou une 
    interface car nous avons simplement besoins besoin du polymorphisme.
    Néanmoins, une interface est ici plus intéréssent a implémenter car nous 
    n'avons pas besoin d'hériter des attributs et de creer un "arbre d'héritage"
    innutile.
    */
    
    /*
    2.5.
    Nous pouvons re-factoriser le code en implémentant une classe mère abstaite 
    "Operation" pour les classes Add, Sub et potentiellement d'autres futures 
    classe (multiplication, division etc...).
    La visibilité de la classe introduite doit être de visibilité public 
    
    */
  }
}

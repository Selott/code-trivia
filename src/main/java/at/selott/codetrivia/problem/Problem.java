package at.selott.codetrivia.problem;

import at.selott.codetrivia.Codetrivia;

public interface Problem<T> {

     T solve();
     void displaySolution();



}

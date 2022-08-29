# TCS
Knight Tour Chess 
1. You are given a number n, the size of a chess board.
2. You are given a row and a column, as a starting point for a knight piece.
3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits
     all cells of the board exactly once.
4. Complete the body of printKnightsTour function - without changing signature - to calculate and
     print all configurations of the chess board representing the route
     of knight through the chess board. Use sample input and output to get more idea.

Note ->  moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and
               move in clockwise manner to
               explore other options.

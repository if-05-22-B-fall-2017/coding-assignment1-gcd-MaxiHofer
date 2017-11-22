[user].
parent(adam,john).
parent(eve,john).
parent(eve,lisa).
parent(john,anne).
parent(john,pat).
parent(pat,jacob).
parent(carol,jacob).

[user].
male(john).
male(adam).
male(jacob).
female(eve).
female(lisa).
female(pat).
female(carol).
female(anne).

[user].
grandparent(X,Z) :- parent(X,Y), parent(Y,Z).
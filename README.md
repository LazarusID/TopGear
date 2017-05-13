# TopGear

You have been assigned to the new electric car project.  Due to budget
issues much of the code was written by unpaid interns.  Having served out
their indenture, the interns have left and been replaced by Full Time
Employees (that's you).

The Product Owner didn't have a lot of time to oversee the interns, and in
any event is non-technical, but the product demos all looked impressive and
the status reports were filed regularly.

Could you just have a look in?  Manufacturing wants to spin up a prototype
next week, and needs signoff on the code before it's loaded onto hardware.

## The Assignment

This is the code for our customer's new environmentally friendly electric
car.  The car is very dependent on software for almost everything, and the
part that we're working on is the automatic gear box. The code you see is
the automatic gear box, which currently shifts up if the engine goes over
2000 rpm, and down if it goes under 500.

For our this new car, it's been determined that the choice of gear can be
much more efficient if we could just set more specific ranges of rpm for
each gear.  Future versions of the car could then use actual measurements of
fuel consumption to configure those ranges on the fly!

Your assignment is to make the gearbox accept a range of rpms for each gear
(and of course use that range to shift gears!)


## Instructors

The intent of this exercise is to gain confidence in both characterization
tests and refactoring to add new features.

The first time I tried this exercise I was able to add 92% line coverage in
about an hour using the Java version.  I'm fairly experienced with
characterization tests, so your session may need a full hour and a half if
this isn't something they do regularly.

If you find yourself constrained for time, after generating a couple of
characterization tests you could open the branch
*characterization-tests-written* so that you can move on to the refactoring
and new code stage of the game.  The first time I presented this I had about
twenty minutes of real time for the coding part of the exercise.  We did not
reach 92% coverage.

If you'd like a little refresher on a refactoring technique that keeps your
code shippable throughout the process, have a read of
https://martinfowler.com/bliki/BranchByAbstraction.html

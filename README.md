# Fortran--Java-Cross-Compiler
Senior Project final source code

This is a personal copy of my senior project group submission.  It is a Fortran->Java Cross Compiler, sponsered by Dr. Kenneth Hoganson of Kennesaw State University.

The program takes in a single Error-Free Fortran Source code file, and produces as output a single, logically equivilent source code file in Java.

The program is not especially robust, and requires a set of conventions that must be adhered to in the Fortran code.

The "wrapper" objects are not actually part of the program, but rather are files required for the result file to run.

All .f95 files in the repository are verified and will run with the program with no errors.

Ideas for future expansion:
1) Expand the parsing to allow for a greater range of Fortran code.
2) Additional error handling.

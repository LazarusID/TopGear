# TopGear C++ Edition

The C++ edition uses CMake and Google Test, a comprehensive
test and mocking suite for C++.

## Google Test

To install Google Test, you will need to run `submodule init --update` from within the git repo.  This should cause Google Test to be added to your repository.

Documentation for Google Test is at https://github.com/google/googletest

## CMake

 * For Linux, install CMake via your package manager.
 * For OSX, install CMake via brew or Mac Ports.
 * For Windows, download CMake from http://www.cmake.org

CMake is a tool for generating build packages.  The most common output is a Unix Makefile.  But if you have other tools you prefer such as Code::Blocks or Visual Studio, it can generate build files for those tools as well.  Check out the documentation at http://cmake.org for details on how to generate output for your system.

## Building and Running Tests

Many IDEs can understand CMake files.  If you are using a CMake aware IDE (QtCreator and CLion are the biggest), it will detect that TopGear-test is one of the targets in your build.  To run tests you should build and run this program.

To build from the command line, change to the C++ folder of the repo.

    c++$ mkdir build
    c++$ cd build
    c++/build$ cmake ..
    c++/build$ make
    c++/build$ test/TopGear-test
    Running main() from gtest_main.cc
    [==========] Running 1 test from 1 test case.
    [----------] Global test environment set-up.
    [----------] 1 test from answer
    [ RUN      ] answer.life_theuniverse_and_everything
    TopGear/c++/test/test_GearBox.cpp:11: Failure
          Expected: 42
    To be equal to: 7 * 9
          Which is: 63
    [  FAILED  ] answer.life_theuniverse_and_everything (0 ms)
    [----------] 1 test from answer (1 ms total)

    [----------] Global test environment tear-down
    [==========] 1 test from 1 test case ran. (1 ms total)
    [  PASSED  ] 0 tests.
    [  FAILED  ] 1 test, listed below:
    [  FAILED  ] answer.life_theuniverse_and_everything

     1 FAILED TEST
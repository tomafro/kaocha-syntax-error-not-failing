## Repository to demonstrate unexpected behaviour running tests via kaocha

In the master branch of this project, running the tests produces the following output (as expected):

    ❯ clojure -A:test
    [(.)]
    1 tests, 1 assertions, 0 failures.

Changing to the branch `test-with-broken-syntax-declaration` (where a bracket has been removed from the `ns` declaration) gives the following instead:

    ❯ clojure -A:test
    []
    0 tests, 0 assertions, 0 failures.

I would expect that instead kaocha would complain that it couldn't load the test file, and return with an error status.

You can compare the two branches here: https://github.com/tomafro/kaocha-syntax-error-not-failing/compare/test-with-broken-syntax-declaration?expand=1

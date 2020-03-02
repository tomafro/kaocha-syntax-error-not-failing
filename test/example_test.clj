(ns example-test
  (:require [clojure.test :as t :refer [deftest is]])

(deftest ^:unit test-one-plus-one
  (is (= 1 1)))

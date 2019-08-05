(ns cljc.java-time.format.resolver-style (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [ResolverStyle]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.format ResolverStyle])))
(def smart (. java.time.format.ResolverStyle -SMART))
(def strict (. java.time.format.ResolverStyle -STRICT))
(def lenient (. java.time.format.ResolverStyle -LENIENT))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.format.ResolverStyle values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.format.ResolverStyle [^java.lang.String java-lang-String14101] (. java.time.format.ResolverStyle valueOf java-lang-String14101)) (^java.lang.Enum [^java.lang.Class java-lang-Class14102 ^java.lang.String java-lang-String14103] (. java.time.format.ResolverStyle valueOf java-lang-Class14102 java-lang-String14103)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.Integer [^java.time.format.ResolverStyle this14104] (.ordinal this14104)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.String [^java.time.format.ResolverStyle this14105] (.toString this14105)))
(clojure.core/defn name {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.String [^java.time.format.ResolverStyle this14106] (.name this14106)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.Class [^java.time.format.ResolverStyle this14107] (jti/getter declaringClass this14107)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.Integer [^java.time.format.ResolverStyle this14108] (.hashCode this14108)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Object"] ["java.time.format.ResolverStyle" "java.lang.Enum"]))} (^java.lang.Integer [this14109 G__14110] #? (:cljs (.compareTo ^java.time.format.ResolverStyle this14109 G__14110) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__14110)) (clojure.core/let [G__14110 ^"java.lang.Object" G__14110] (.compareTo ^java.time.format.ResolverStyle this14109 G__14110)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__14110)) (clojure.core/let [G__14110 ^"java.lang.Enum" G__14110] (.compareTo ^java.time.format.ResolverStyle this14109 G__14110)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn equals {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.ResolverStyle this14111 ^java.lang.Object java-lang-Object14112] (.equals this14111 java-lang-Object14112)))

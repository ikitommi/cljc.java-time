(ns cljc.java-time.period (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Period]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time Period])))
(def zero (. java.time.Period -ZERO))
(clojure.core/defn get-months {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12721] (jti/getter months this12721)))
(clojure.core/defn of-weeks {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12722] (. java.time.Period ofWeeks int12722)))
(clojure.core/defn of-days {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12723] (. java.time.Period ofDays int12723)))
(clojure.core/defn is-negative {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this12724] (.isNegative this12724)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"]))} (^java.time.Period [^java.lang.Integer int12725 ^java.lang.Integer int12726 ^java.lang.Integer int12727] (. java.time.Period of int12725 int12726 int12727)))
(clojure.core/defn is-zero {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this12728] (.isZero this12728)))
(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Period" "int"] ["java.time.Period" "int"]))} (^java.lang.Object [this12729 G__12730] #? (:cljs (.multipliedBy ^java.time.Period this12729 G__12730) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__12730)) (clojure.core/let [G__12730 (clojure.core/int G__12730)] (.multipliedBy ^java.time.Period this12729 G__12730)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__12730)) (clojure.core/let [G__12730 (clojure.core/int G__12730)] (.multipliedBy ^java.time.Period this12729 G__12730)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-units {:arglists (quote (["java.time.Period"]))} (^java.util.List [^java.time.Period this12731] (jti/getter units this12731)))
(clojure.core/defn with-days {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this12732 ^java.lang.Integer int12733] (.withDays this12732 int12733)))
(clojure.core/defn plus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"] ["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this12734 G__12735] #? (:cljs (.plus ^java.time.Period this12734 G__12735) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12735)) (clojure.core/let [G__12735 ^"java.time.temporal.TemporalAmount" G__12735] (.plus ^java.time.Period this12734 G__12735)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12735)) (clojure.core/let [G__12735 ^"java.time.temporal.TemporalAmount" G__12735] (.plus ^java.time.Period this12734 G__12735)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn of-months {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12736] (. java.time.Period ofMonths int12736)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Period"]))} (^java.lang.String [^java.time.Period this12737] (.toString this12737)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12738 ^long long12739] (.plusMonths this12738 long12739)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12740 ^long long12741] (.minusMonths this12740 long12741)))
(clojure.core/defn minus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"] ["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this12742 G__12743] #? (:cljs (.minus ^java.time.Period this12742 G__12743) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12743)) (clojure.core/let [G__12743 ^"java.time.temporal.TemporalAmount" G__12743] (.minus ^java.time.Period this12742 G__12743)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12743)) (clojure.core/let [G__12743 ^"java.time.temporal.TemporalAmount" G__12743] (.minus ^java.time.Period this12742 G__12743)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn add-to {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this12744 ^java.time.temporal.Temporal java-time-temporal-Temporal12745] (.addTo this12744 java-time-temporal-Temporal12745)))
(clojure.core/defn to-total-months {:arglists (quote (["java.time.Period"]))} (^long [^java.time.Period this12746] (.toTotalMonths this12746)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12747 ^long long12748] (.plusDays this12747 long12748)))
(clojure.core/defn of-years {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int12749] (. java.time.Period ofYears int12749)))
(clojure.core/defn get-days {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12750] (jti/getter days this12750)))
(clojure.core/defn negated {:arglists (quote (["java.time.Period"] ["java.time.Period"]))} (^java.lang.Object [this12751] #? (:cljs (.negated ^java.time.Period this12751) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.negated ^java.time.Period this12751)) (clojure.core/and) (clojure.core/let [] (.negated ^java.time.Period this12751)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-years {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12752] (jti/getter years this12752)))
(clojure.core/defn with-years {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this12753 ^java.lang.Integer int12754] (.withYears this12753 int12754)))
(clojure.core/defn normalized {:arglists (quote (["java.time.Period"] ["java.time.Period"]))} (^java.lang.Object [this12755] #? (:cljs (.normalized ^java.time.Period this12755) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.normalized ^java.time.Period this12755)) (clojure.core/and) (clojure.core/let [] (.normalized ^java.time.Period this12755)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-months {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this12756 ^java.lang.Integer int12757] (.withMonths this12756 int12757)))
(clojure.core/defn between {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))} (^java.time.Period [^java.time.LocalDate java-time-LocalDate12758 ^java.time.LocalDate java-time-LocalDate12759] (. java.time.Period between java-time-LocalDate12758 java-time-LocalDate12759)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount12760] (. java.time.Period from java-time-temporal-TemporalAmount12760)))
(clojure.core/defn minus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12761 ^long long12762] (.minusYears this12761 long12762)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.Period"] ["java.time.Period"]))} (^java.lang.Object [this12763] #? (:cljs (jti/getter chronology ^java.time.Period this12763) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.Period this12763)) (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.Period this12763)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^java.time.Period [^java.lang.CharSequence java-lang-CharSequence12764] (. java.time.Period parse java-lang-CharSequence12764)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this12765] (.hashCode this12765)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this12766 ^java.time.temporal.Temporal java-time-temporal-Temporal12767] (.subtractFrom this12766 java-time-temporal-Temporal12767)))
(clojure.core/defn get {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Period this12768 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit12769] (.get this12768 java-time-temporal-TemporalUnit12769)))
(clojure.core/defn equals {:arglists (quote (["java.time.Period" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Period this12770 ^java.lang.Object java-lang-Object12771] (.equals this12770 java-lang-Object12771)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12772 ^long long12773] (.plusYears this12772 long12773)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this12774 ^long long12775] (.minusDays this12774 long12775)))

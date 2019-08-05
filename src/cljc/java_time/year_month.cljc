(ns cljc.java-time.year-month (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [YearMonth]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time YearMonth])))
(clojure.core/defn length-of-year {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this13820] (.lengthOfYear this13820)))
(clojure.core/defn range {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.YearMonth this13821 ^java.time.temporal.TemporalField java-time-temporal-TemporalField13822] (.range this13821 java-time-temporal-TemporalField13822)))
(clojure.core/defn is-valid-day {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.lang.Boolean [^java.time.YearMonth this13823 ^java.lang.Integer int13824] (.isValidDay this13823 int13824)))
(clojure.core/defn of {:arglists (quote (["int" "java.time.Month"] ["int" "int"]))} (^java.time.YearMonth [G__13826 G__13827] #? (:cljs (. java.time.YearMonth of G__13826 G__13827) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__13826) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__13827)) (clojure.core/let [G__13826 (clojure.core/int G__13826) G__13827 ^"java.time.Month" G__13827] (. java.time.YearMonth of G__13826 G__13827)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__13826) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__13827)) (clojure.core/let [G__13826 (clojure.core/int G__13826) G__13827 (clojure.core/int G__13827)] (. java.time.YearMonth of G__13826 G__13827)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-month {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.time.YearMonth [^java.time.YearMonth this13828 ^java.lang.Integer int13829] (.withMonth this13828 int13829)))
(clojure.core/defn at-day {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.time.LocalDate [^java.time.YearMonth this13830 ^java.lang.Integer int13831] (.atDay this13830 int13831)))
(clojure.core/defn get-year {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this13832] (jti/getter year this13832)))
(clojure.core/defn plus {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"] ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "java.time.temporal.TemporalAmount"] ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this13833 G__13834] #? (:cljs (.plus ^java.time.YearMonth this13833 G__13834) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13834)) (clojure.core/let [G__13834 ^"java.time.temporal.TemporalAmount" G__13834] (.plus ^java.time.YearMonth this13833 G__13834)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13834)) (clojure.core/let [G__13834 ^"java.time.temporal.TemporalAmount" G__13834] (.plus ^java.time.YearMonth this13833 G__13834)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this13835 G__13836 G__13837] #? (:cljs (.plus ^java.time.YearMonth this13835 G__13836 G__13837) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13836) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13837)) (clojure.core/let [G__13836 (clojure.core/long G__13836) G__13837 ^"java.time.temporal.TemporalUnit" G__13837] (.plus ^java.time.YearMonth this13835 G__13836 G__13837)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13836) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13837)) (clojure.core/let [G__13836 (clojure.core/long G__13836) G__13837 ^"java.time.temporal.TemporalUnit" G__13837] (.plus ^java.time.YearMonth this13835 G__13836 G__13837)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn is-leap-year {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Boolean [^java.time.YearMonth this13838] (.isLeapYear this13838)))
(clojure.core/defn query {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.YearMonth this13839 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery13840] (.query this13839 java-time-temporal-TemporalQuery13840)))
(clojure.core/defn to-string {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.String [^java.time.YearMonth this13841] (.toString this13841)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this13842 ^long long13843] (.plusMonths this13842 long13843)))
(clojure.core/defn is-before {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))} (^java.lang.Boolean [^java.time.YearMonth this13844 ^java.time.YearMonth java-time-YearMonth13845] (.isBefore this13844 java-time-YearMonth13845)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this13846 ^long long13847] (.minusMonths this13846 long13847)))
(clojure.core/defn minus {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAmount"] ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "long" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this13848 G__13849] #? (:cljs (.minus ^java.time.YearMonth this13848 G__13849) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13849)) (clojure.core/let [G__13849 ^"java.time.temporal.TemporalAmount" G__13849] (.minus ^java.time.YearMonth this13848 G__13849)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13849)) (clojure.core/let [G__13849 ^"java.time.temporal.TemporalAmount" G__13849] (.minus ^java.time.YearMonth this13848 G__13849)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this13850 G__13851 G__13852] #? (:cljs (.minus ^java.time.YearMonth this13850 G__13851 G__13852) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13851) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13852)) (clojure.core/let [G__13851 (clojure.core/long G__13851) G__13852 ^"java.time.temporal.TemporalUnit" G__13852] (.minus ^java.time.YearMonth this13850 G__13851 G__13852)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13851) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13852)) (clojure.core/let [G__13851 (clojure.core/long G__13851) G__13852 ^"java.time.temporal.TemporalUnit" G__13852] (.minus ^java.time.YearMonth this13850 G__13851 G__13852)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-long {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^long [^java.time.YearMonth this13853 ^java.time.temporal.TemporalField java-time-temporal-TemporalField13854] (.getLong this13853 java-time-temporal-TemporalField13854)))
(clojure.core/defn with-year {:arglists (quote (["java.time.YearMonth" "int"]))} (^java.time.YearMonth [^java.time.YearMonth this13855 ^java.lang.Integer int13856] (.withYear this13855 int13856)))
(clojure.core/defn at-end-of-month {:arglists (quote (["java.time.YearMonth"]))} (^java.time.LocalDate [^java.time.YearMonth this13857] (.atEndOfMonth this13857)))
(clojure.core/defn length-of-month {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this13858] (.lengthOfMonth this13858)))
(clojure.core/defn until {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.YearMonth this13859 ^java.time.temporal.Temporal java-time-temporal-Temporal13860 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit13861] (.until this13859 java-time-temporal-Temporal13860 java-time-temporal-TemporalUnit13861)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.YearMonth [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor13862] (. java.time.YearMonth from java-time-temporal-TemporalAccessor13862)))
(clojure.core/defn is-after {:arglists (quote (["java.time.YearMonth" "java.time.YearMonth"]))} (^java.lang.Boolean [^java.time.YearMonth this13863 ^java.time.YearMonth java-time-YearMonth13864] (.isAfter this13863 java-time-YearMonth13864)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalUnit"] ["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this13865 G__13866] #? (:cljs (.isSupported ^java.time.YearMonth this13865 G__13866) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13866)) (clojure.core/let [G__13866 ^"java.time.temporal.TemporalUnit" G__13866] (.isSupported ^java.time.YearMonth this13865 G__13866)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__13866)) (clojure.core/let [G__13866 ^"java.time.temporal.TemporalField" G__13866] (.isSupported ^java.time.YearMonth this13865 G__13866)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this13867 ^long long13868] (.minusYears this13867 long13868)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.YearMonth [^java.lang.CharSequence java-lang-CharSequence13869] (. java.time.YearMonth parse java-lang-CharSequence13869)) (^java.time.YearMonth [^java.lang.CharSequence java-lang-CharSequence13870 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter13871] (. java.time.YearMonth parse java-lang-CharSequence13870 java-time-format-DateTimeFormatter13871)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this13872] (.hashCode this13872)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.YearMonth" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.YearMonth this13873 ^java.time.temporal.Temporal java-time-temporal-Temporal13874] (.adjustInto this13873 java-time-temporal-Temporal13874)))
(clojure.core/defn with {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"] ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"] ["java.time.YearMonth" "java.time.temporal.TemporalAdjuster"] ["java.time.YearMonth" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this13875 G__13876] #? (:cljs (.with ^java.time.YearMonth this13875 G__13876) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__13876)) (clojure.core/let [G__13876 ^"java.time.temporal.TemporalAdjuster" G__13876] (.with ^java.time.YearMonth this13875 G__13876)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__13876)) (clojure.core/let [G__13876 ^"java.time.temporal.TemporalAdjuster" G__13876] (.with ^java.time.YearMonth this13875 G__13876)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this13877 G__13878 G__13879] #? (:cljs (.with ^java.time.YearMonth this13877 G__13878 G__13879) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__13878) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13879)) (clojure.core/let [G__13878 ^"java.time.temporal.TemporalField" G__13878 G__13879 (clojure.core/long G__13879)] (.with ^java.time.YearMonth this13877 G__13878 G__13879)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__13878) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13879)) (clojure.core/let [G__13878 ^"java.time.temporal.TemporalField" G__13878 G__13879 (clojure.core/long G__13879)] (.with ^java.time.YearMonth this13877 G__13878 G__13879)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))} (^java.time.YearMonth [] (. java.time.YearMonth now)) (^java.time.YearMonth [G__13881] #? (:cljs (. java.time.YearMonth now G__13881) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__13881)) (clojure.core/let [G__13881 ^"java.time.Clock" G__13881] (. java.time.YearMonth now G__13881)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__13881)) (clojure.core/let [G__13881 ^"java.time.ZoneId" G__13881] (. java.time.YearMonth now G__13881)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.YearMonth"]))} (^java.lang.Integer [^java.time.YearMonth this13882] (jti/getter monthValue this13882)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.YearMonth" "java.lang.Object"] ["java.time.YearMonth" "java.time.YearMonth"]))} (^java.lang.Integer [this13883 G__13884] #? (:cljs (.compareTo ^java.time.YearMonth this13883 G__13884) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__13884)) (clojure.core/let [G__13884 ^"java.lang.Object" G__13884] (.compareTo ^java.time.YearMonth this13883 G__13884)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.YearMonth") G__13884)) (clojure.core/let [G__13884 ^"java.time.YearMonth" G__13884] (.compareTo ^java.time.YearMonth this13883 G__13884)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-month {:arglists (quote (["java.time.YearMonth"]))} (^java.time.Month [^java.time.YearMonth this13885] (jti/getter month this13885)))
(clojure.core/defn get {:arglists (quote (["java.time.YearMonth" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.YearMonth this13886 ^java.time.temporal.TemporalField java-time-temporal-TemporalField13887] (.get this13886 java-time-temporal-TemporalField13887)))
(clojure.core/defn equals {:arglists (quote (["java.time.YearMonth" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.YearMonth this13888 ^java.lang.Object java-lang-Object13889] (.equals this13888 java-lang-Object13889)))
(clojure.core/defn format {:arglists (quote (["java.time.YearMonth" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.YearMonth this13890 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter13891] (.format this13890 java-time-format-DateTimeFormatter13891)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.YearMonth" "long"]))} (^java.time.YearMonth [^java.time.YearMonth this13892 ^long long13893] (.plusYears this13892 long13893)))

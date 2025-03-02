(ns cljc.java-time.temporal.temporal-unit (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.temporal :refer [TemporalUnit]]))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^java.lang.String [^js/JSJoda.TemporalUnit this61541] (.toString this61541)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal"]))} (^boolean [^js/JSJoda.TemporalUnit this61542 ^js/JSJoda.Temporal java-time-temporal-Temporal61543] (.isSupportedBy this61542 java-time-temporal-Temporal61543)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^boolean [^js/JSJoda.TemporalUnit this61544] (.isTimeBased this61544)))
(clojure.core/defn get-duration {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^js/JSJoda.Duration [^js/JSJoda.TemporalUnit this61545] (.duration this61545)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "long"]))} (^js/JSJoda.Temporal [^js/JSJoda.TemporalUnit this61546 ^js/JSJoda.Temporal java-time-temporal-Temporal61547 ^long long61548] (.addTo this61546 java-time-temporal-Temporal61547 long61548)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.TemporalUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^long [^js/JSJoda.TemporalUnit this61549 ^js/JSJoda.Temporal java-time-temporal-Temporal61550 ^js/JSJoda.Temporal java-time-temporal-Temporal61551] (.between this61549 java-time-temporal-Temporal61550 java-time-temporal-Temporal61551)))
(clojure.core/defn is-duration-estimated {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^boolean [^js/JSJoda.TemporalUnit this61552] (.isDurationEstimated this61552)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.TemporalUnit"]))} (^boolean [^js/JSJoda.TemporalUnit this61553] (.isDateBased this61553)))

(ns cljc.java-time.temporal.temporal-amount (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [TemporalAmount]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.temporal TemporalAmount])))
(clojure.core/defn get {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.temporal.TemporalAmount this13988 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit13989] (.get this13988 java-time-temporal-TemporalUnit13989)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this13990 ^java.time.temporal.Temporal java-time-temporal-Temporal13991] (.addTo this13990 java-time-temporal-Temporal13991)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.temporal.TemporalAmount" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.temporal.TemporalAmount this13992 ^java.time.temporal.Temporal java-time-temporal-Temporal13993] (.subtractFrom this13992 java-time-temporal-Temporal13993)))
(clojure.core/defn get-units {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^java.util.List [^java.time.temporal.TemporalAmount this13994] (jti/getter units this13994)))

package poc.common

object constants {
  
 // val modelDir = "/home/hduser/RoboAdvisor/neuralNet/";
   val modelDir = "/home/cloudera/NeuralNets";
 // val warehouseLocation = "hdfs://synecloud:9000/user/hive/warehouse/";
   val warehouseLocation = "hdfs://quickstart.cloudera:8020/user/hive/warehouse/";
 //   val metastore = "thrift://synecloud:9083";
     val metastore = "thrift://quickstart.cloudera:9083";
 val sparkMaster = "spark://synecloud:7077";
 //  val sparkMaster = "local";
 val appName = "RoboAdvisor"
     
  
  
  val spCompanyList :Map[Int,String] = 
Map(
0 -> "A" ,
1 -> "AA" ,
2 -> "AAL" ,
3 -> "AAP" ,
4 -> "AAPL" ,
5 -> "ABBV" ,
6 -> "ABC" ,
7 -> "ABT" ,
8 -> "ACN" ,
9 -> "ADBE" ,
10 -> "ADI" ,
11 -> "ADM" ,
12 -> "ADP" ,
13 -> "ADS" ,
14 -> "ADSK" ,
15 -> "AEE" ,
16 -> "AEP" ,
17 -> "AES" ,
18 -> "AET" ,
19 -> "AFL" ,
20 -> "AGN" ,
21 -> "AIG" ,
22 -> "AIV" ,
23 -> "AIZ" ,
24 -> "AJG" ,
25 -> "AKAM" ,
26 -> "ALB" ,
27 -> "ALK" ,
28 -> "ALL" ,
29 -> "ALLE" ,
30 -> "ALXN" ,
31 -> "AMAT" ,
32 -> "AME" ,
33 -> "AMG" ,
34 -> "AMGN" ,
35 -> "AMP" ,
36 -> "AMT" ,
37 -> "AMZN" ,
38 -> "AN" ,
39 -> "ANTM" ,
40 -> "AON" ,
41 -> "APA" ,
42 -> "APC" ,
43 -> "APD" ,
44 -> "APH" ,
45 -> "ATVI" ,
46 -> "AVB" ,
47 -> "AVGO" ,
48 -> "AVY" ,
49 -> "AWK" ,
50 -> "AXP" ,
51 -> "AYI" ,
52 -> "AZO" ,
53 -> "BA" ,
54 -> "BAC" ,
55 -> "BAX" ,
56 -> "BBBY" ,
57 -> "BBT" ,
58 -> "BBY" ,
59 -> "BCR" ,
60 -> "BDX" ,
61 -> "BEN" ,
62 -> "BF-B" ,
63 -> "BHI" ,
64 -> "BIIB" ,
65 -> "BK" ,
66 -> "BLK" ,
67 -> "BLL" ,
68 -> "BMY" ,
69 -> "BRK-B" ,
70 -> "BSX" ,
71 -> "BWA" ,
72 -> "BXP" ,
73 -> "C" ,
74 -> "CA" ,
75 -> "CAG" ,
76 -> "CAH" ,
77 -> "CAT" ,
78 -> "CB" ,
79 -> "CBG" ,
80 -> "CBS" ,
81 -> "CCI" ,
82 -> "CCL" ,
83 -> "CELG" ,
84 -> "CERN" ,
85 -> "CF" ,
86 -> "CFG" ,
87 -> "CHD" ,
88 -> "CHK" ,
89 -> "CHRW" ,
90 -> "CHTR" ,
91 -> "CI" ,
92 -> "CINF" ,
93 -> "CL" ,
94 -> "CLX" ,
95 -> "CMA" ,
96 -> "CMCSA" ,
97 -> "CME" ,
98 -> "CMG" ,
99 -> "CMI" ,
100 -> "CMS" ,
101 -> "CNC" ,
102 -> "CNP" ,
103 -> "COF" ,
104 -> "COG" ,
105 -> "COH" ,
106 -> "COL" ,
107 -> "COO" ,
108 -> "COP" ,
109 -> "COST" ,
110 -> "COTY" ,
111 -> "CPB" ,
112 -> "CRM" ,
113 -> "CSCO" ,
114 -> "CSRA" ,
115 -> "CSX" ,
116 -> "CTAS" ,
117 -> "CTL" ,
118 -> "CTSH" ,
119 -> "CTXS" ,
120 -> "CVS" ,
121 -> "CVX" ,
122 -> "CXO" ,
123 -> "D" ,
124 -> "DAL" ,
125 -> "DD" ,
126 -> "DE" ,
127 -> "DFS" ,
128 -> "DG" ,
129 -> "DGX" ,
130 -> "DHI" ,
131 -> "DHR" ,
132 -> "DIS" ,
133 -> "DISCA" ,
134 -> "DISCK" ,
135 -> "DLPH" ,
136 -> "DLR" ,
137 -> "DLTR" ,
138 -> "DNB" ,
139 -> "DOV" ,
140 -> "DOW" ,
141 -> "DPS" ,
142 -> "DRI" ,
143 -> "DTE" ,
144 -> "DUK" ,
145 -> "DVA" ,
146 -> "DVN" ,
147 -> "EA" ,
148 -> "EBAY" ,
149 -> "ECL" ,
150 -> "ED" ,
151 -> "EFX" ,
152 -> "EIX" ,
153 -> "EL" ,
154 -> "EMN" ,
155 -> "EMR" ,
156 -> "ENDP" ,
157 -> "EOG" ,
158 -> "EQIX" ,
159 -> "EQR" ,
160 -> "EQT" ,
161 -> "ES" ,
162 -> "ESRX" ,
163 -> "ESS" ,
164 -> "ETFC" ,
165 -> "ETN" ,
166 -> "ETR" ,
167 -> "EW" ,
168 -> "EXC" ,
169 -> "EXPD" ,
170 -> "EXPE" ,
171 -> "EXR" ,
172 -> "F" ,
173 -> "FAST" ,
174 -> "FB" ,
175 -> "FBHS" ,
176 -> "FCX" ,
177 -> "FDX" ,
178 -> "FE" ,
179 -> "FFIV" ,
180 -> "FIS" ,
181 -> "FISV" ,
182 -> "FITB" ,
183 -> "FL" ,
184 -> "FLIR" ,
185 -> "FLR" ,
186 -> "FLS" ,
187 -> "FMC" ,
188 -> "FOX" ,
189 -> "FOXA" ,
190 -> "FRT" ,
191 -> "FSLR" ,
192 -> "FTI" ,
193 -> "FTR" ,
194 -> "FTV" ,
195 -> "GD" ,
196 -> "GE" ,
197 -> "GGP" ,
198 -> "GILD" ,
199 -> "GIS" ,
200 -> "GLW" ,
201 -> "GM" ,
202 -> "GOOG" ,
203 -> "GOOGL" ,
204 -> "GPC" ,
205 -> "GPN" ,
206 -> "GPS" ,
207 -> "GRMN" ,
208 -> "GS" ,
209 -> "GT" ,
210 -> "GWW" ,
211 -> "HAL" ,
212 -> "HAR" ,
213 -> "HAS" ,
214 -> "HBAN" ,
215 -> "HBI" ,
216 -> "HCA" ,
217 -> "HCN" ,
218 -> "HCP" ,
219 -> "HD" ,
220 -> "HES" ,
221 -> "HIG" ,
222 -> "HOG" ,
223 -> "HOLX" ,
224 -> "HON" ,
225 -> "HP" ,
226 -> "HPE" ,
227 -> "HPQ" ,
228 -> "HRB" ,
229 -> "HRL" ,
230 -> "HRS" ,
231 -> "HSIC" ,
232 -> "HST" ,
233 -> "HSY" ,
234 -> "HUM" ,
235 -> "IBM" ,
236 -> "ICE" ,
237 -> "IFF" ,
238 -> "ILMN" ,
239 -> "INTC" ,
240 -> "INTU" ,
241 -> "IP" ,
242 -> "IPG" ,
243 -> "IR" ,
244 -> "IRM" ,
245 -> "ISRG" ,
246 -> "ITW" ,
247 -> "IVZ" ,
248 -> "JBHT" ,
249 -> "JCI" ,
250 -> "JEC" ,
251 -> "JNJ" ,
252 -> "JNPR" ,
253 -> "JPM" ,
254 -> "JWN" ,
255 -> "K" ,
256 -> "KEY" ,
257 -> "KHC" ,
258 -> "KIM" ,
259 -> "KLAC" ,
260 -> "KMB" ,
261 -> "KMI" ,
262 -> "KMX" ,
263 -> "KO" ,
264 -> "KORS" ,
265 -> "KR" ,
266 -> "KSS" ,
267 -> "KSU" ,
268 -> "L" ,
269 -> "LB" ,
270 -> "LEG" ,
271 -> "LEN" ,
272 -> "LH" ,
273 -> "LKQ" ,
274 -> "LLL" ,
275 -> "LLTC" ,
276 -> "LLY" ,
277 -> "LM" ,
278 -> "LMT" ,
279 -> "LNC" ,
280 -> "LNT" ,
281 -> "LOW" ,
282 -> "LRCX" ,
283 -> "LUK" ,
284 -> "LUV" ,
285 -> "LVLT" ,
286 -> "LYB" ,
287 -> "M" ,
288 -> "MA" ,
289 -> "MAC" ,
290 -> "MAR" ,
291 -> "MAS" ,
292 -> "MAT" ,
293 -> "MCD" ,
294 -> "MCHP" ,
295 -> "MCK" ,
296 -> "MCO" ,
297 -> "MDLZ" ,
298 -> "MDT" ,
299 -> "MET" ,
300 -> "MHK" 
)


/*
 * 301 -> "MJN" ,
302 -> "MKC" ,
303 -> "MLM" ,
304 -> "MMC" ,
305 -> "MMM" ,
306 -> "MNK" ,
307 -> "MNST" ,
308 -> "MO" ,
309 -> "MON" ,
310 -> "MOS" ,
311 -> "MPC" ,
312 -> "MRK" ,
313 -> "MRO" ,
314 -> "MS" ,
315 -> "MSFT" ,
316 -> "MSI" ,
317 -> "MTB" ,
318 -> "MTD" ,
319 -> "MU" ,
320 -> "MUR" ,
321 -> "MYL" ,
322 -> "NAVI" ,
323 -> "NBL" ,
324 -> "NDAQ" ,
325 -> "NEE" ,
326 -> "NEM" ,
327 -> "NFLX" ,
328 -> "NFX" ,
329 -> "NI" ,
330 -> "NKE" ,
331 -> "NLSN" ,
332 -> "NOC" ,
333 -> "NOV" ,
334 -> "NRG" ,
335 -> "NSC" ,
336 -> "NTAP" ,
337 -> "NTRS" ,
338 -> "NUE" ,
339 -> "NVDA" ,
340 -> "NWL" ,
341 -> "NWS" ,
342 -> "NWSA" ,
343 -> "O" ,
344 -> "OI" ,
345 -> "OKE" ,
346 -> "OMC" ,
347 -> "ORCL" ,
348 -> "ORLY" ,
349 -> "OXY" ,
350 -> "PAYX" ,
351 -> "PBCT" ,
352 -> "PBI" ,
353 -> "PCAR" ,
354 -> "PCG" ,
355 -> "PCLN" ,
356 -> "PDCO" ,
357 -> "PEG" ,
358 -> "PEP" ,
359 -> "PFE" ,
360 -> "PFG" ,
361 -> "PG" ,
362 -> "PGR" ,
363 -> "PH" ,
364 -> "PHM" ,
365 -> "PKI" ,
366 -> "PLD" ,
367 -> "PM" ,
368 -> "PNC" ,
369 -> "PNR" ,
370 -> "PNW" ,
371 -> "PPG" ,
372 -> "PPL" ,
373 -> "PRGO" ,
374 -> "PRU" ,
375 -> "PSA" ,
376 -> "PSX" ,
377 -> "PVH" ,
378 -> "PWR" ,
379 -> "PX" ,
380 -> "PXD" ,
381 -> "PYPL" ,
382 -> "QCOM" ,
383 -> "QRVO" ,
384 -> "R" ,
385 -> "RAI" ,
386 -> "RCL" ,
387 -> "REGN" ,
388 -> "RF" ,
389 -> "RHI" ,
390 -> "RHT" ,
391 -> "RIG" ,
392 -> "RL" ,
393 -> "ROK" ,
394 -> "ROP" ,
395 -> "ROST" ,
396 -> "RRC" ,
397 -> "RSG" ,
398 -> "RTN" ,
399 -> "SBUX" ,
400 -> "SCG" ,
401 -> "SCHW" ,
402 -> "SE" ,
403 -> "SEE" ,
404 -> "SHW" ,
405 -> "SIG" ,
406 -> "SJM" ,
407 -> "SLB" ,
408 -> "SLG" ,
409 -> "SNA" ,
410 -> "SNI" ,
411 -> "SO" ,
412 -> "SPG" ,
413 -> "SPGI" ,
414 -> "SPLS" ,
415 -> "SRCL" ,
416 -> "SRE" ,
417 -> "STI" ,
418 -> "STJ" ,
419 -> "STT" ,
420 -> "STX" ,
421 -> "STZ" ,
422 -> "SWK" ,
423 -> "SWKS" ,
424 -> "SWN" ,
425 -> "SYF" ,
426 -> "SYK" ,
427 -> "SYMC" ,
428 -> "SYY" ,
429 -> "T" ,
430 -> "TAP" ,
431 -> "TDC" ,
432 -> "TDG" ,
433 -> "TEL" ,
434 -> "301 -> "MJN" ,
302 -> "MKC" ,
303 -> "MLM" ,
304 -> "MMC" ,
305 -> "MMM" ,
306 -> "MNK" ,
307 -> "MNST" ,
308 -> "MO" ,
309 -> "MON" ,
310 -> "MOS" ,
311 -> "MPC" ,
312 -> "MRK" ,
313 -> "MRO" ,
314 -> "MS" ,
315 -> "MSFT" ,
316 -> "MSI" ,
317 -> "MTB" ,
318 -> "MTD" ,
319 -> "MU" ,
320 -> "MUR" ,
321 -> "MYL" ,
322 -> "NAVI" ,
323 -> "NBL" ,
324 -> "NDAQ" ,
325 -> "NEE" ,
326 -> "NEM" ,
327 -> "NFLX" ,
328 -> "NFX" ,
329 -> "NI" ,
330 -> "NKE" ,
331 -> "NLSN" ,
332 -> "NOC" ,
333 -> "NOV" ,
334 -> "NRG" ,
335 -> "NSC" ,
336 -> "NTAP" ,
337 -> "NTRS" ,
338 -> "NUE" ,
339 -> "NVDA" ,
340 -> "NWL" ,
341 -> "NWS" ,
342 -> "NWSA" ,
343 -> "O" ,
344 -> "OI" ,
345 -> "OKE" ,
346 -> "OMC" ,
347 -> "ORCL" ,
348 -> "ORLY" ,
349 -> "OXY" ,
350 -> "PAYX" ,
351 -> "PBCT" ,
352 -> "PBI" ,
353 -> "PCAR" ,
354 -> "PCG" ,
355 -> "PCLN" ,
356 -> "PDCO" ,
357 -> "PEG" ,
358 -> "PEP" ,
359 -> "PFE" ,
360 -> "PFG" ,
361 -> "PG" ,
362 -> "PGR" ,
363 -> "PH" ,
364 -> "PHM" ,
365 -> "PKI" ,
366 -> "PLD" ,
367 -> "PM" ,
368 -> "PNC" ,
369 -> "PNR" ,
370 -> "PNW" ,
371 -> "PPG" ,
372 -> "PPL" ,
373 -> "PRGO" ,
374 -> "PRU" ,
375 -> "PSA" ,
376 -> "PSX" ,
377 -> "PVH" ,
378 -> "PWR" ,
379 -> "PX" ,
380 -> "PXD" ,
381 -> "PYPL" ,
382 -> "QCOM" ,
383 -> "QRVO" ,
384 -> "R" ,
385 -> "RAI" ,
386 -> "RCL" ,
387 -> "REGN" ,
388 -> "RF" ,
389 -> "RHI" ,
390 -> "RHT" ,
391 -> "RIG" ,
392 -> "RL" ,
393 -> "ROK" ,
394 -> "ROP" ,
395 -> "ROST" ,
396 -> "RRC" ,
397 -> "RSG" ,
398 -> "RTN" ,
399 -> "SBUX" ,
400 -> "SCG" ,
401 -> "SCHW" ,
402 -> "SE" ,
403 -> "SEE" ,
404 -> "SHW" ,
405 -> "SIG" ,
406 -> "SJM" ,
407 -> "SLB" ,
408 -> "SLG" ,
409 -> "SNA" ,
410 -> "SNI" ,
411 -> "SO" ,
412 -> "SPG" ,
413 -> "SPGI" ,
414 -> "SPLS" ,
415 -> "SRCL" ,
416 -> "SRE" ,
417 -> "STI" ,
418 -> "STJ" ,
419 -> "STT" ,
420 -> "STX" ,
421 -> "STZ" ,
422 -> "SWK" ,
423 -> "SWKS" ,
424 -> "SWN" ,
425 -> "SYF" ,
426 -> "SYK" ,
427 -> "SYMC" ,
428 -> "SYY" ,
429 -> "T" ,
430 -> "TAP" ,
431 -> "TDC" ,
432 -> "TDG" ,
433 -> "TEL" ,
434 -> "TGNA" ,
435 -> "TGT" ,
436 -> "TIF" ,
437 -> "TJX" ,
438 -> "TMK" ,
439 -> "TMO" ,
440 -> "TRIP" ,
441 -> "TROW" ,
442 -> "TRV" ,
443 -> "TSCO" ,
444 -> "TSN" ,
445 -> "TSO" ,
446 -> "TSS" ,
447 -> "TWX" ,
448 -> "TXN" ,
449 -> "TXT" ,
450 -> "UA.C" ,
451 -> "UA" ,
452 -> "UAL" ,
453 -> "UDR" ,
454 -> "UHS" ,
455 -> "ULTA" ,
456 -> "UNH" ,
457 -> "UNM" ,
458 -> "UNP" ,
459 -> "UPS" ,
460 -> "URBN" ,
461 -> "URI" ,
462 -> "USB" ,
463 -> "UTX" ,
464 -> "V" ,
465 -> "VAR" ,
466 -> "VFC" ,
467 -> "VIAB" ,
468 -> "VLO" ,
469 -> "VMC" ,
470 -> "VNO" ,
471 -> "VRSK" ,
472 -> "VRSN" ,
473 -> "VRTX" ,
474 -> "VTR" ,
475 -> "VZ" ,
476 -> "WAT" ,
477 -> "301 -> "MJN" ,
302 -> "MKC" ,
303 -> "MLM" ,
304 -> "MMC" ,
305 -> "MMM" ,
306 -> "MNK" ,
307 -> "MNST" ,
308 -> "MO" ,
309 -> "MON" ,
310 -> "MOS" ,
311 -> "MPC" ,
312 -> "MRK" ,
313 -> "MRO" ,
314 -> "MS" ,
315 -> "MSFT" ,
316 -> "MSI" ,
317 -> "MTB" ,
318 -> "MTD" ,
319 -> "MU" ,
320 -> "MUR" ,
321 -> "MYL" ,
322 -> "NAVI" ,
323 -> "NBL" ,
324 -> "NDAQ" ,
325 -> "NEE" ,
326 -> "NEM" ,
327 -> "NFLX" ,
328 -> "NFX" ,
329 -> "NI" ,
330 -> "NKE" ,
331 -> "NLSN" ,
332 -> "NOC" ,
333 -> "NOV" ,
334 -> "NRG" ,
335 -> "NSC" ,
336 -> "NTAP" ,
337 -> "NTRS" ,
338 -> "NUE" ,
339 -> "NVDA" ,
340 -> "NWL" ,
341 -> "NWS" ,
342 -> "NWSA" ,
343 -> "O" ,
344 -> "OI" ,
345 -> "OKE" ,
346 -> "OMC" ,
347 -> "ORCL" ,
348 -> "ORLY" ,
349 -> "OXY" ,
350 -> "PAYX" ,
351 -> "PBCT" ,
352 -> "PBI" ,
353 -> "PCAR" ,
354 -> "PCG" ,
355 -> "PCLN" ,
356 -> "PDCO" ,
357 -> "PEG" ,
358 -> "PEP" ,
359 -> "PFE" ,
360 -> "PFG" ,
361 -> "PG" ,
362 -> "PGR" ,
363 -> "PH" ,
364 -> "PHM" ,
365 -> "PKI" ,
366 -> "PLD" ,
367 -> "PM" ,
368 -> "PNC" ,
369 -> "PNR" ,
370 -> "PNW" ,
371 -> "PPG" ,
372 -> "PPL" ,
373 -> "PRGO" ,
374 -> "PRU" ,
375 -> "PSA" ,
376 -> "PSX" ,
377 -> "PVH" ,
378 -> "PWR" ,
379 -> "PX" ,
380 -> "PXD" ,
381 -> "PYPL" ,
382 -> "QCOM" ,
383 -> "QRVO" ,
384 -> "R" ,
385 -> "RAI" ,
386 -> "RCL" ,
387 -> "REGN" ,
388 -> "RF" ,
389 -> "RHI" ,
390 -> "RHT" ,
391 -> "RIG" ,
392 -> "RL" ,
393 -> "ROK" ,
394 -> "ROP" ,
395 -> "ROST" ,
396 -> "RRC" ,
397 -> "RSG" ,
398 -> "RTN" ,
399 -> "SBUX" ,
400 -> "SCG" ,
401 -> "SCHW" ,
402 -> "SE" ,
403 -> "SEE" ,
404 -> "SHW" ,
405 -> "SIG" ,
406 -> "SJM" ,
407 -> "SLB" ,
408 -> "SLG" ,
409 -> "SNA" ,
410 -> "SNI" ,
411 -> "SO" ,
412 -> "SPG" ,
413 -> "SPGI" ,
414 -> "SPLS" ,
415 -> "SRCL" ,
416 -> "SRE" ,
417 -> "STI" ,
418 -> "STJ" ,
419 -> "STT" ,
420 -> "STX" ,
421 -> "STZ" ,
422 -> "SWK" ,
423 -> "SWKS" ,
424 -> "SWN" ,
425 -> "SYF" ,
426 -> "SYK" ,
427 -> "SYMC" ,
428 -> "SYY" ,
429 -> "T" ,
430 -> "TAP" ,
431 -> "TDC" ,
432 -> "TDG" ,
433 -> "TEL" ,
434 -> "TGNA" ,
435 -> "TGT" ,
436 -> "TIF" ,
437 -> "TJX" ,
438 -> "TMK" ,
439 -> "TMO" ,
440 -> "TRIP" ,
441 -> "TROW" ,
442 -> "TRV" ,
443 -> "TSCO" ,
444 -> "TSN" ,
445 -> "TSO" ,
446 -> "TSS" ,
447 -> "TWX" ,
448 -> "TXN" ,
449 -> "TXT" ,
450 -> "UA.C" ,
451 -> "UA" ,
452 -> "UAL" ,
453 -> "UDR" ,
454 -> "UHS" ,
455 -> "ULTA" ,
456 -> "UNH" ,
457 -> "UNM" ,
458 -> "UNP" ,
459 -> "UPS" ,
460 -> "URBN" ,
461 -> "URI" ,
462 -> "USB" ,
463 -> "UTX" ,
464 -> "V" ,
465 -> "VAR" ,
466 -> "VFC" ,
467 -> "VIAB" ,
468 -> "VLO" ,
469 -> "VMC" ,
470 -> "VNO" ,
471 -> "VRSK" ,
472 -> "VRSN" ,
473 -> "VRTX" ,
474 -> "VTR" ,
475 -> "VZ" ,
476 -> "WAT" ,
477 -> "WBA" ,
478 -> "WDC" ,
479 -> "WEC" ,
480 -> "WFC" ,
481 -> "WFM" ,
482 -> "WHR" ,
483 -> "WLTW" ,
484 -> "WM" ,
485 -> "WMB" ,
486 -> "WMT" ,
487 -> "WRK" ,
488 -> "WU" ,
489 -> "WY" ,
490 -> "WYN" ,
491 -> "WYNN" ,
492 -> "XEC" ,
493 -> "XEL" ,
494 -> "XL" ,
495 -> "XLNX" ,
496 -> "XOM" ,
497 -> "XRAY" ,
498 -> "XRX" ,
499 -> "XYL" ,
500 -> "YHOO" ,
501 -> "YUM" ,
502 -> "ZBH" ,
503 -> "ZION" ,
504 -> "ZTS" WBA" ,
478 -> "WDC" ,
479 -> "WEC" ,
480 -> "WFC" ,
481 -> "WFM" ,
482 -> "WHR" ,
483 -> "WLTW" ,
484 -> "WM" ,
485 -> "WMB" ,
486 -> "WMT" ,
487 -> "WRK" ,
488 -> "WU" ,
489 -> "WY" ,
490 -> "WYN" ,
491 -> "WYNN" ,
492 -> "XEC" ,
493 -> "XEL" ,
494 -> "XL" ,
495 -> "XLNX" ,
496 -> "XOM" ,
497 -> "XRAY" ,
498 -> "XRX" ,
499 -> "XYL" ,
500 -> "YHOO" ,
501 -> "YUM" ,
502 -> "ZBH" ,
503 -> "ZION" ,
504 -> "ZTS" TGNA" ,
435 -> "TGT" ,
436 -> "TIF" ,
437 -> "TJX" ,
438 -> "TMK" ,
439 -> "TMO" ,
440 -> "TRIP" ,
441 -> "TROW" ,
442 -> "TRV" ,
443 -> "TSCO" ,
444 -> "TSN" ,
445 -> "TSO" ,
446 -> "TSS" ,
447 -> "TWX" ,
448 -> "TXN" ,
449 -> "TXT" ,
450 -> "UA.C" ,
451 -> "UA" ,
452 -> "UAL" ,
453 -> "UDR" ,
454 -> "UHS" ,
455 -> "ULTA" ,
456 -> "UNH" ,
457 -> "UNM" ,
458 -> "UNP" ,
459 -> "UPS" ,
460 -> "URBN" ,
461 -> "URI" ,
462 -> "USB" ,
463 -> "UTX" ,
464 -> "V" ,
465 -> "VAR" ,
466 -> "VFC" ,
467 -> "VIAB" ,
468 -> "VLO" ,
469 -> "VMC" ,
470 -> "VNO" ,
471 -> "VRSK" ,
472 -> "VRSN" ,
473 -> "VRTX" ,
474 -> "VTR" ,
475 -> "VZ" ,
476 -> "WAT" ,
477 -> "WBA" ,
478 -> "WDC" ,
479 -> "WEC" ,
480 -> "WFC" ,
481 -> "WFM" ,
482 -> "WHR" ,
483 -> "WLTW" ,
484 -> "WM" ,
485 -> "WMB" ,
486 -> "WMT" ,
487 -> "WRK" ,
488 -> "WU" ,
489 -> "WY" ,
490 -> "WYN" ,
491 -> "WYNN" ,
492 -> "XEC" ,
493 -> "XEL" ,
494 -> "XL" ,
495 -> "XLNX" ,
496 -> "XOM" ,
497 -> "XRAY" ,
498 -> "XRX" ,
499 -> "XYL" ,
500 -> "YHOO" ,
501 -> "YUM" ,
502 -> "ZBH" ,
503 -> "ZION" ,
504 -> "ZTS" 
*/
 
}
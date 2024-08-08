# DataSafety

Data Safety Section is an important step towards increased platform support for data transparency, allowing users to easily understand how apps process their data.
Unfortunately, in its current implementation, bad practices and relaxed policies can confuse both end-users and developers, while also creating opportunities for abuse and 
the surreptitious exfiltration of data. In this work, we developed a system that automatically identifies discrepancies between apps’ run-time behavior and what data developers 
disclose in Data Safety. Our system analyzes and identifies discrepancies in applications based on different run-time consent scenarios.

### Prerequisites

* LSPosed Framework (https://github.com/LSPosed/LSPosed)
* MitM proxy (https://mitmproxy.org)
* Reaper (https://github.com/Michalis-Diamantaris/Reaper)
* Frida Objection for SSL Unpinning (https://github.com/sensepost/objection)

### Files

* **dataset/**
  
  Contains six csv datasets of apps with discrepancies across 3 time periods (March '23, June '23, September '23) in both the DataCollected section and DataShared section, including functions, PIIS, and the corresponding
  Data Safety labels that the apps collect/share but do not disclose in the Data Safety section. Also, it includes two files listing Google apps with discrepancies.
  
* **DataSafety_labelling.csv**

  This is a spreadsheet with the mappings of each function call to the corresponding Data Safety label

* **API_methods_list**

  This is the expanded version of Reaper's permission-protected function list and the list of non-permission-protected functions that yield Personally Identifiable Information (PII) 

* **pseudocode/RunTimeConsentDialogDynamicIdentifier.pdf**

  This is the pseudocode of the script we implemented and used to identify run-time consent dialogs dynamically.

### Paper

For technical details please refer to our publication:

Abandon All Hope Ye Who Enter Here: A Dynamic, Longitudinal Investigation of Android’s Data Safety Section

https://www.usenix.org/conference/usenixsecurity24/presentation/arkalakis

<br>

#  TrieDict (1.0.0)

[![Java](https://img.shields.io/badge/Java-Temurin%2023-blue)](https://adoptium.net/en-GB/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Build](https://img.shields.io/badge/build-passing-brightgreen)]()

> A fast, offline dictionary CLI tool built in Java using a Trie for efficient word lookup and auto-suggestions.

---

- Word Lookup with part-of-speech and meaning
- Works entirely offline
- Auto-suggestions when a word isn’t found
- Built using a Trie data structure for quick prefix search
- Parses dictionary data from a JSON file
- Clean REPL-style CLI interface

## Usage

```bash
Welcome to TrieDict!!
Use the following commands:
-search + (word) : to look-up a word in the Dictionary
-suggest + (word) : to get suggestion close to ur word
-exit: to exit

> search help
(noun) Action given to provide assistance; aid.
> search tr
No such word found in dictionary: 
Finding Suggestions
Suggestions [try, tree, trip]
```

## Download and Run

You can download the latest pre-built .jar file from the [Releases](https://github.com/pranjalg05/TrieDict/tree/master/releases) section.

```bash
java -jar TrieDict.jar
```
> Make sure Java is installed and added to your system Path

## Dictionary Format

Dictionary was generated use [Dictionary Generator](https://github.com/pranjalg05/Dictionary-Generator) in JSON format and was parsed using jackson JSON parser

```json
[
  {
    "word": "apple",
    "pos": "noun",
    "meaning": "a fruit that is round and red or green"
  },
  ...
]
```

## Future Ideas

- GUI support using JavaFx
- Java Script for loading dictionary
- custom wordlist and dicitonary generation
- more commands
- bookmarks



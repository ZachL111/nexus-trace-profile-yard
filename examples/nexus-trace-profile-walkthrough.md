# Nexus Trace Profile Yard Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 156 | ship |
| stress | latency skew | 157 | ship |
| edge | signal loss | 126 | watch |
| recovery | incident shape | 135 | watch |
| stale | span volume | 190 | ship |

Start with `stale` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around latency skew and incident shape.

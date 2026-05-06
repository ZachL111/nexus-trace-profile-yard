# Review Journal

The repository goal stays the same: package a Scala local lab for profile analysis with windowed input fixtures, late-data behavior checks, and documented operating limits. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 156, lane `ship`
- `stress`: `latency skew`, score 157, lane `ship`
- `edge`: `signal loss`, score 126, lane `watch`
- `recovery`: `incident shape`, score 135, lane `watch`
- `stale`: `span volume`, score 190, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.

# nexus-trace-profile-yard

`nexus-trace-profile-yard` is a Scala project in observability. Its focus is to package a Scala local lab for profile analysis with windowed input fixtures, late-data behavior checks, and documented operating limits.

## Why I Keep It Small

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how span volume and signal loss should influence a review result.

## Nexus Trace Profile Yard Review Notes

`stale` and `edge` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/nexus-trace-profile-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `span volume` and `signal loss`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Scala implementation avoids hidden state so fixture changes are easy to reason about.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Scope

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.

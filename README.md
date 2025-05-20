
DISCLAIMER - ABANDONED/UNMAINTAINED CODE / DO NOT USE
=======================================================
While this repository has been inactive for some time, this formal notice, issued on **December 10, 2024**, serves as the official declaration to clarify the situation. Consequently, this repository and all associated resources (including related projects, code, documentation, and distributed packages such as Docker images, PyPI packages, etc.) are now explicitly declared **unmaintained** and **abandoned**.

I would like to remind everyone that this project’s free license has always been based on the principle that the software is provided "AS-IS", without any warranty or expectation of liability or maintenance from the maintainer.
As such, it is used solely at the user's own risk, with no warranty or liability from the maintainer, including but not limited to any damages arising from its use.

Due to the enactment of the Cyber Resilience Act (EU Regulation 2024/2847), which significantly alters the regulatory framework, including penalties of up to €15M, combined with its demands for **unpaid** and **indefinite** liability, it has become untenable for me to continue maintaining all my Open Source Projects as a natural person.
The new regulations impose personal liability risks and create an unacceptable burden, regardless of my personal situation now or in the future, particularly when the work is done voluntarily and without compensation.

**No further technical support, updates (including security patches), or maintenance, of any kind, will be provided.**

These resources may remain online, but solely for public archiving, documentation, and educational purposes.

Users are strongly advised not to use these resources in any active or production-related projects, and to seek alternative solutions that comply with the new legal requirements (EU CRA).

**Using these resources outside of these contexts is strictly prohibited and is done at your own risk.**

This project has been transfered to Makina Corpus <freesoftware@makina-corpus.com> ( https://makina-corpus.com ). This project and its associated resources, including published resources related to this project (e.g., from PyPI, Docker Hub, GitHub, etc.), may be removed starting **March 15, 2025**, especially if the CRA’s risks remain disproportionate.

mxisd - Federated Matrix Identity Server Daemon
-----
![Travis-CI build status](https://travis-ci.org/kamax-io/mxisd.svg?branch=master)  

- [Overview](#overview)
- [Features](#features)
- [Why use mxisd](#why-use-mxisd)
- [Getting Started](#getting-started)
- [Support](#support)
- [Contribute](#contribute)
- [FAQ](#faq)
- [Contact](#contact)

# Overview
mxisd is a Federated Matrix Identity server for self-hosted Matrix infrastructures with [enhanced features](#features).
  
It is specifically designed to connect to an Identity store (AD/Samba/LDAP, SQL Database, Web services/application, ...)
and ease the integration of the Matrix ecosystem with an existing infrastructure, or to build a new one using lasting
tools.

The core principle of mxisd is to map between Matrix IDs and 3PIDs (Third-party Identifiers) for the Homeserver and its
users. 3PIDs can be anything that identify a user, like:
- Full name
- Email address
- Phone number
- Employee number
- Skype/Live ID
- Twitter handle
- Facebook ID
- ...

mxisd is an enhanced Identity service, which implements the
[Matrix Identity service API](https://matrix.org/docs/spec/identity_service/unstable.html) but also several
[other features](#features) that greatly enhance user experience within Matrix.

mxisd is the one stop shop for anything regarding Authentication, Directory and Identity management in Matrix built as a
single coherent product.

# Features
As a [regular Matrix Identity service](docs/features/identity.md):
- Search for people by 3PID using its own Identity stores (LDAP, SQL, etc.)
- Invite people to rooms by 3PID using its own Identity stores, with [notifications](docs/README.md)
to the invitee (Email, SMS, etc.)
- Allow users to add 3PIDs to their settings/profile

As an enhanced Identity service:
- Use a recursive lookup mechanism when searching and inviting people by 3PID, allowing to fetch data from:
  - Own Identity store
  - Federated Identity servers, if applicable to the 3PID
  - Arbitrary Identity servers
  - Central Matrix Identity servers
- [Extensive control of where 3PIDs are transmited](docs/sessions/3pid.md), so they are not leaked publicly by users
- [Authentication support](docs/features/authentication.md) for [synapse](https://github.com/matrix-org/synapse) via the
[REST auth module](https://github.com/kamax-io/matrix-synapse-rest-auth)
- [Directory integration](docs/features/directory-users.md) which allows you to search for users within your
organisation, even without prior Matrix contact
- [Auto-fill of user profile](docs/features/authentication.md) (Display name, 3PIDs) via the
[REST auth module](https://github.com/kamax-io/matrix-synapse-rest-auth)

# Why use mxisd
- Use your existing Identity store, do not duplicate information
- Auto-fill user profiles with relevant information
- As an organisation, stay in control of 3PIDs so they are not published to the central Matrix.org servers where they
currently **cannot be removed**
- Users can directly find each other using whatever attribute is relevant within your Identity store
- Federate your Identity lookups so you can discover others and/or others can discover you, all with extensive ACLs

# Getting started
See the [dedicated document](docs/getting-started.md)

# Support
## Community
If you need help, want to report a bug or just say hi, you can reach us on Matrix at 
[#mxisd:kamax.io](https://matrix.to/#/#mxisd:kamax.io) or
[directly peek anonymously](https://view.matrix.org/room/!NPRUEisLjcaMtHIzDr:kamax.io/).
For more high-level discussion about the Identity Server architecture/API, go to 
[#matrix-identity:matrix.org](https://matrix.to/#/#matrix-identity:matrix.org)

## Professional
If you would prefer professional support/custom development for mxisd and/or for Matrix in general, including other open
source technologies/products, please visit [our website](https://www.kamax.io/) to get in touch with us and get a quote.

We offer affordable monthly/yearly support plans for mxisd, synapse or your full Matrix infrastructure.

# Contribute
First and foremost, the best way to contribute is to use mxisd and tell us about it!  
We would love to hear about your experience and get your feedback on how to make it an awesome product. 

You can contribute as a community member by:
- Opening issues for any weird behaviour or bug. mxisd should feel natural, let us know if it does not!
- Helping us improve the documentation: tell us what is good or not good (in an issue or in Matrix), or make a PR with
changes you feel improve the doc.
- Contribute code directly: we love contributors! All your contributions will be licensed under AGPLv3.
- [Donate!](https://liberapay.com/maximusdor/) Any donation is welcome, regardless how small or big, and will directly
be used for the fixed costs and developer time of mxisd.

You can contribute as an organisation/corporation by:
- Get a [support contract](#support-professional). This is the best way you can help us as it ensures mxisd is
maintained regularly and you get direct access to the support team.
- Sponsoring new features or bug fixes. [Get in touch](#contact) so we can discuss it further.

# FAQ
See the [dedicated document](docs/faq.md)

# Contact
Get in touch via:
- Matrix at [#mxisd:kamax.io](https://matrix.to/#/#mxisd:kamax.io)
- Email, see our website: [Kamax.io](https://www.kamax.io)

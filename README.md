# java-web-bazel-blade-traefik-hello-world

## Description
A POC for blade framework rendering html page with self signed ssl certs.

## Tech stack
- cors
- ssl

## Docker stack
- alpine:edge
- l.gcr.io/google/bazel:latest
- traefik:v2.4

## To run
`sudo ./install.sh -u`
Available at https://myapi.docker.localhost

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Blade framework code](https://github.com/eugenp/tutorials/tree/master/web-modules/blade)
java_binary (
    name = "BazelApp",
    srcs = glob(["java/**/*.java"]),
    main_class = "example.Main",
    deps = [
        "@maven//:jakarta_xml_bind_jakarta_xml_bind_api",
        "@maven//:org_glassfish_jaxb_jaxb_runtime",
        "@maven//:org_apache_commons_commons_lang3",
        "@maven//:org_webjars_bootstrap",
        "@maven//:com_bladejava_blade_mvc"
    ],
    resources = [
      "resources/templates/index.html"
    ],
    visibility = ["//visibility:public"],
)

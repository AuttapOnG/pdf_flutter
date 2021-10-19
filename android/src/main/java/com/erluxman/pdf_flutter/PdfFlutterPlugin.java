package com.erluxman.pdf_flutter;

/**
 * PdfFlutterPlugin
 */
public class PdfFlutterPlugin{

    @SuppressWarnings("deprecation")
    public static void registerWith(io.flutter.plugin.common.PluginRegistry.Registrar registrar) {
        registrar
                .platformViewRegistry()
                .registerViewFactory(
                        "pdf_flutter_plugin", new PdfFlutterFactory(registrar.messenger()));

    }
}

/**
 * The main (and only) module for Yaeger. Currently both the public and internal API are part of
 * this one module.
 * <p>
 * Only the subpackages of the public API are exported ({@code com.github.hanyaeger.api}) and directly
 * accessible through JavaDoc. Those classes that are only meant for internal use ({@code com.github.hanyaeger.core})
 * are not exported and can not be used from outside this module. Their JavaDoc is indirectly accessible, when viewing
 * the JavaDoc of the external API.
 */
module Quaggle {
    requires  hanyaeger;

    exports com.github.hanyaeger.tutorial;
    exports com.github.hanyaeger.tutorial.MainMenu;

    opens audio;
    opens backgrounds;
    exports com.github.hanyaeger.tutorial.Scenes;
    exports com.github.hanyaeger.tutorial.Buttons;
//    opens sprites;

}

/**
 * The main (and only) module for Yaeger. Currently both the public and internal API are part of
 * this one module.
 * <p>
 * Only the subpackages of the public API are exported ({@code com.github.hanyaeger.api}) and directly
 * accessible through JavaDoc. Those classes that are only meant for internal use ({@code com.github.hanyaeger.core})
 * are not exported and can not be used from outside this module. Their JavaDoc is indirectly accessible, when viewing
 * the JavaDoc of the external API.
 */
module waggle {
    requires  hanyaeger;

    exports com.github.hanyaeger.tutorial;

    opens audio;
    opens backgrounds;
    opens sprites;

}

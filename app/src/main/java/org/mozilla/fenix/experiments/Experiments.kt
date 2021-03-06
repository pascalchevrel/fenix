/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.experiments

class Experiments {
    companion object {
        const val A_A_NIMBUS_VALIDATION = "fenix-nimbus-validation-v3"
        const val ANDROID_KEYSTORE = "fenix-android-keystore"
        const val DEFAULT_BROWSER = "fenix-default-browser"
    }
}

class ExperimentBranch {
    companion object {
        const val TREATMENT = "treatment"
        const val CONTROL = "control"
        const val A1 = "a1"
        const val A2 = "a2"
        const val DEFAULT_BROWSER_TOOLBAR_MENU = "default_browser_toolbar_menu"
        const val DEFAULT_BROWSER_NEW_TAB_BANNER = "default_browser_newtab_banner"
        const val DEFAULT_BROWSER_SETTINGS_MENU = "default_browser_settings_menu"
    }
}

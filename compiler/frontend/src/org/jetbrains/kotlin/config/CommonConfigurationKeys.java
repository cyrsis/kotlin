/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.config;

public class CommonConfigurationKeys {
    private CommonConfigurationKeys() {
    }

    public static final CompilerConfigurationKey<LanguageFeatureSettings> LANGUAGE_FEATURE_SETTINGS =
            CompilerConfigurationKey.create("language feature settings");

    public static final CompilerConfigurationKey<Boolean> DISABLE_INLINE =
            CompilerConfigurationKey.create("disable inline");

    public static final CompilerConfigurationKey<String> MODULE_NAME =
            CompilerConfigurationKey.create("module name");

    public static final CompilerConfigurationKey<Boolean> REPL_MODE =
            CompilerConfigurationKey.create("REPL mode");
}

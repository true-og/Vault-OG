# Vault-OG

Vault-OG is a soft fork of the Vault Abstraction Library for Bukkit supporting 1.19.4 maintained by [TrueOG Network](https://trueog.net/).

## Differences over Vault
- Uses JDK17 [8eb60bf](https://github.com/MilkBowl/Vault/commit/8eb60bf578f76f3cf7f8593556b12a5486543c3b).
- Drops support for ancient chat and permissions plugins [e55ef74](https://github.com/graycat27/Vault/commit/e55ef74e16ca98581ad25c4664457e0bfbaf82d9).
- Refactored maven file so that the plugin actually builds.

## For Developers:
Please see the [VaultAPI](https://www.github.com/MilkBowl/VaultAPI) page for
information on developing with Vault's API. In the past, you would use the same
artifact as servers installed, but the API has now been split from the main
project and is under a different artifact name. Please make sure you accommodate
this change in your build process.

## Installing
Installing Vault is as simple as copying the provided "Vault.jar" to your
"<bukkit-install-dir>/plugins" directory, and the rest is automatic! If you
wish to perform configuration changes, this can be done via a configuration
file but should not be necessary in most cases. See the "Advanced
Configuration" section for more information.

## Permissions
* vault.admin
  - Determines if a player should receive the update notices

## License
Copyright (C) 2011-2018 Morgan Humes <morgan@lanaddict.com>

Vault is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Vault is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
with Vault. If not, see <http://www.gnu.org/licenses/>.

## Building
Vault comes with all libraries needed to build from the current branch and
also comes with an Apache Ant build file (build.xml) and a Maven build file
(pom.xml). Maven is currently the preferred build method. Simply run:

```mvn clean package```

## Dependencies
Because Vault provides a bridge to other plugins, their binaries will be
required to build from. To ease this, they have been included in the lib
folder and will be updated from time to time. For plugin developers, it
is not necessary to use these libraries when implementing Vault. You will
only need to compile against Vault.

## Supported Plugins
Vault-OG provides abstraction for the following categories and plugins. If
you have your own plugin that you believe should be supported, you'll need
to add your own connector within your plugin as Vault no longer maintains
new plugin connectors.

  - Group Manager (Essentials) (https://forums.bukkit.org/threads/15312/)
  - LuckPerms (https://www.spigotmc.org/resources/luckperms-an-advanced-permissions-plugin.28140/)

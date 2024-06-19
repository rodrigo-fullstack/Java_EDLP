

#!/bin/bash

find . -mindepth 2 -type f -name "*.md" -exec bash -c 'mv "$0" "$(dirname "$0")/$(basename "$(dirname "$0")").md"' {} \;




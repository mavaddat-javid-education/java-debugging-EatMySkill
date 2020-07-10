$curr=Get-Location
Get-ChildItem -Recurse | Sort-Object LastWriteTime | Select-Object -Last 1 | ForEach-Object {Set-Location "$($_.FullName)/../";    &"javac" "./$(($target=$_.Name -replace "\..+",'')).java"; &"java" "$target"}
Set-Location $curr
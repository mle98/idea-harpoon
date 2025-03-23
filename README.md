# Idea-Harpoon

This is an IntelliJ port of the neovim plugin made by ThePrimeagen (https://github.com/ThePrimeagen/harpoon).
So far, only the basic functionality of adding the current file to the list, and switching between the entries is implemented.

The UI part, and the non-index basic file adding is not implemented, and there is currently no plan for this as a future feature.
Since this plugin is most useful with multiple keybindings, IdeaVIM is highly recommended (but not a necessity).

## Available IntelliJ Actions
- SetFile1
- SetFile2
- SetFile3
- SetFile4
- OpenFile1
- OpenFile2
- OpenFile3
- OpenFile4

## Sample .ideavimrc
```
nmap <leader><S-j> <Action>(SetFile1)
nmap <leader><S-k> <Action>(SetFile2)
nmap <leader><S-l> <Action>(SetFile3)
nmap <leader><S-;> <Action>(SetFile4)

nmap <leader>j <Action>(OpenFile1)
nmap <leader>k <Action>(OpenFile2)
nmap <leader>l <Action>(OpenFile3)
nmap <leader>; <Action>(OpenFile4)
```

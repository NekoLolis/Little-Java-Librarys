package neko.libs;

public class Terminal {

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printBanner() {
        System.out.println("\n" +
                "                             ...     ...                      ..                  \n" +
                "                          .=*8888n..\"%888:              < .z@8\"`                  \n" +
                "                         X    ?8888f '8888               !@88E               u.   \n" +
                "                         88x. '8888X  8888>       .u     '888E   u     ...ue888b  \n" +
                "                        '8888k 8888X  '\"*8h.   ud8888.    888E u@8NL   888R Y888r \n" +
                "                         \"8888 X888X .xH8    :888'8888.   888E`\"88*\"   888R I888> \n" +
                "                           `8\" X888!:888X    d888 '88%\"   888E .dN.    888R I888> \n" +
                "                          =~`  X888 X888X    8888.+\"      888E~8888    888R I888> \n" +
                "                           :h. X8*` !888X    8888L        888E '888&  u8888cJ888  \n" +
                "                          X888xX\"   '8888..: '8888c. .+   888E  9888.  \"*888*P\"   \n" +
                "                        :~`888f     '*888*\"   \"88888%   '\"888*\" 4888\"    'Y\"      \n" +
                "                            \"\"        `\"`       \"YP'       \"\"    \"\"               \n" +
                "                                                                        \n" +
                "                                            Made By NekoLolis                            \n" +
                "                                          https://nekololis.wtf                            \n" +
                "                                        https://github.com/NekoLolis                            \n");
    }



}

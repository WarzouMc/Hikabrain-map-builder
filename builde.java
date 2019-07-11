    public void initMap(){
        World world = Bukkit.getWorlds().get(0);

        for (int x = -21; x < 22; x++) {
            for (int y = 50; y < 73; y++) {
                for (int z = -7; z < 8; z++){
                    world.getBlockAt(x, y, z).setType(Material.AIR);
                    world.getBlockAt(x, 69, z).setType(Material.STAINED_GLASS);
                }
            }
        }

        for (int y = 50; y < 73; y++){
            for (int x = -22; x < 23; x++){
                for (int z = -8; z < 9; z++){
                    if(x == -22 || x == 22 || z == -8 || z == 8){
                        if (y < 70){
                            world.getBlockAt(x, y, z).setType(Material.OBSIDIAN);
                        }else if (y > 70){
                            world.getBlockAt(x, y, z).setType(Material.BEDROCK);
                        }else {
                            world.getBlockAt(x, y, z).setType(Material.AIR);
                        }
                    }
                }
            }
        }

        for (int x = -21; x < 22; x++) {
            for (int y = 50; y < 60; y++) {
                if(x == 0 && y == 59){
                    world.getBlockAt(x, y, 0).setType(Material.REDSTONE_BLOCK);
                }else if((x == 21 || x == 20) && y == 59){
                    world.getBlockAt(x, y, 0).setType(Material.WOOL);
                    world.getBlockAt(x, y, 0).setData(( byte ) 11);
                }else if((x == -21 || x == -20) && y == 59){
                    world.getBlockAt(x, y, 0).setType(Material.WOOL);
                    world.getBlockAt(x, y, 0).setData(( byte ) 14);
                }else{
                    world.getBlockAt(x, y, 0).setType(Material.SANDSTONE);
                }
            }
        }

        for (int x = 19; x < 22; x++) {
            for (int z = -1; z < 2; z++) {
                world.getBlockAt(x, 63, z).setType(Material.STAINED_GLASS);
                world.getBlockAt(x, 63, z).setData(( byte ) 11);
            }
        }

        for (int x = -21; x < -18; x++) {
            for (int z = -1; z < 2; z++) {
                world.getBlockAt(x, 63, z).setType(Material.STAINED_GLASS);
                world.getBlockAt(x, 63, z).setData(( byte ) 14);
            }
        }
    }

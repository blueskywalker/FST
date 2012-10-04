package org.blueskywalker.fst;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BuildFST {

    @SuppressWarnings("unused")

    private static final Logger logger = LogManager.getLogger(BuildFST.class);

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("buildFST inputFile outputFile");
            return;
        }

        try {
            EntryTable table = new EntryTable();
            table.readFromFile(args[0]);
            if (!table.checkUnique()) {
                logger.error("Input is not uniq data.");
                return;
            }

            FiniteStateTable fst = new FiniteStateTable(table);
            fst.build(args[1]);

        } catch (Exception e) {
            logger.info("BuildFST Error", e);

        }
    }
}
